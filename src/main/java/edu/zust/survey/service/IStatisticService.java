package edu.zust.survey.service;

import edu.zust.survey.entity.Suggestion;

import java.util.List;
import java.util.Map;

/**
 * @Author Rin
 * @Date 2017/10/20
 */
public interface IStatisticService {
    List<Suggestion> getSuggestionList(int majorId);
    Integer getCountSum(Integer majorId, Integer grade);
    Integer getAnsweredCountSum(Integer majorId, Integer grade);
    Map<Integer, Integer> getStatisticResultMap(Integer questionnaireId, Integer grade);
}
