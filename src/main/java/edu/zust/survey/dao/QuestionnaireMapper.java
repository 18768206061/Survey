package edu.zust.survey.dao;

import edu.zust.survey.entity.Questionnaire;
import edu.zust.survey.vo.IdAndNameVo;

import java.util.List;

public interface QuestionnaireMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Questionnaire record);

    int insertSelective(Questionnaire record);

    Questionnaire selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Questionnaire record);

    int updateByPrimaryKey(Questionnaire record);

    List<Integer> selectAllId();

    List<Questionnaire> selectByMajorId(int majorId);
}