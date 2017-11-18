package edu.zust.survey.service;

import edu.zust.survey.entity.Manager;
import edu.zust.survey.vo.AnswerSheetVo;

/**
 * Created by Lee on 2017/10/19.
 */
public interface IManagerService {

    Manager login(String username, String password);

    boolean addManager(String username, String password, Integer majorId);

    boolean addGrade(Integer majorId, Integer grade);

    AnswerSheetVo assembleAnswerSheetVo(Integer studentId);

    void getAllAnswerSheet(Integer majorId, Integer grade, String rootPath);
}
