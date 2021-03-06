package edu.zust.survey.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import edu.zust.survey.common.Const;
import edu.zust.survey.entity.Manager;
import edu.zust.survey.entity.Student;
import edu.zust.survey.service.IQuestionnaireService;
import edu.zust.survey.vo.DesignModel;
import edu.zust.survey.vo.QuestionnaireModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by Lee on 2017/11/13.
 */
@Controller
@RequestMapping("/")
public class QuestionnaireController {

    @Autowired
    private IQuestionnaireService questionnaireService;

    @RequestMapping(value = "admin/questionnaires", method = RequestMethod.GET)
    public String createQuestionnaireModel(HttpSession session, Model model){
        //jsonString = "{'part1':['问题1','问题2'],'part2':[{'questionContent':'你为什么要自定义问题啊','answerContent':['知道','不知道']},{'questionContent':'你为什么要自定义问题2','answerContent':['知道','不知道']}]}";
        Manager manager = (Manager) session.getAttribute(Const.CURRENT_USER);
        if (manager != null){
            DesignModel designModel = new DesignModel();
            designModel.setName("未命名的问卷");
            designModel.setPart1(Lists.newArrayList());
            designModel.setPart2(Lists.newArrayList());
            model.addAttribute(Const.DESIGN_MODEL, JSON.toJSON(designModel));
            model.addAttribute("newDesignModel", 1);
            return "design";
        }
        return "loginFailed";
    }

    @RequestMapping(value = "admin/questionnaires", method = RequestMethod.POST)
    public String createQuestionnaireModel(HttpSession session, String jsonString){
        //jsonString = "{'part1':['问题1','问题2'],'part2':[{'questionContent':'你为什么要自定义问题啊','answerContent':['知道','不知道']},{'questionContent':'你为什么要自定义问题2','answerContent':['知道','不知道']}]}";
        Manager manager = (Manager) session.getAttribute(Const.CURRENT_USER);
        if (manager != null){
            questionnaireService.createQuestionnaire(manager.getMajorId(), jsonString, null);
            return "designSucceed";
        }
        return "loginFailed";
    }

    @RequestMapping(value = "admin/questionnaires/{questionnaireId}/modify", method = RequestMethod.POST)
    public String modifyQuestion(HttpSession session, String jsonString, @PathVariable Integer questionnaireId){
        //jsonString = "{'part1':['问题1','问题2'],'part2':[{'questionContent':'你为什么要自定义问题啊','answerContent':['知道','不知道']},{'questionContent':'你为什么要自定义问题2','answerContent':['知道','不知道']}]}";
        Manager manager = (Manager) session.getAttribute(Const.CURRENT_USER);
        if (manager != null){
            questionnaireService.modifyQuestionnaireModel(manager.getMajorId(), questionnaireId, jsonString);
            return "designSucceed";
        }
        return "";
    }

    @RequestMapping(value = "admin/questionnaires/{questionnaireId}/delete", method = RequestMethod.GET)
    public String deleteQuestionnaire(HttpSession session, @PathVariable Integer questionnaireId){
        if (questionnaireService.deleteQuestionnaireModel(questionnaireId)){
            return "";
        }
        return "";
    }

    @RequestMapping(value = "admin/questionnaires/{questionnaireId}", method = RequestMethod.POST)
    public String chooseQuestionnaire(HttpSession session, @PathVariable Integer questionnaireId){
        Manager manager = (Manager) session.getAttribute(Const.CURRENT_USER);
        if (manager != null){
            Integer majorId = manager.getMajorId();
            if (questionnaireService.chooseQuestionnaireModel(majorId,questionnaireId)){
                return "";
            }
        }
        return "";
    }

    @RequestMapping(value = "admin/questionnaires/list", method = RequestMethod.GET)
    public String getQuestionnaireCatalog(HttpSession session, Model model){
        Manager manager = (Manager) session.getAttribute(Const.CURRENT_USER);
        if (manager != null){
            Integer majorId = manager.getMajorId();
            model.addAttribute(Const.QUESTIONNAIRE_CATALOG, questionnaireService.assembleQuestionnaireVos(majorId));
        }
        return "chooseDesignModel";
    }
}
