<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/plugins/layui/css/layui.css" />
    <link rel="stylesheet" href="/css/statistics.css" />
    <title>statistics</title>
</head>

<body>
    <div class="main">
        <blockquote class="layui-elem-quote layui-quote-nm">
            <p>专业名称：软件工程</p>
            <p>该专业参与调查的总人数：9999人</p>
            <p>已答题人数：6666人</p>
            <p>未答题人数：3333人</p>
            <p>已答题人数所占比例：66.6%</p>
        </blockquote>
        <div>
            <div class="layui-form">
                <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
                    <legend>一、毕业要求达成度调查</legend>
                </fieldset>
                <div class="question-block">
                    <div class="question-title">1. 您对我校的教学质量满意吗？</div>
                    <div class="choice">
                        <div class="choice-item">
                            <span>非常满意</span>
                            <span class="statis">选择人数<span class="num-choose">570</span> | 占比<span class="percent">60%</span></span>
                        </div>
                        <div class="choice-item">
                            <span>较满意</span>
                            <span class="statis">选择人数<span class="num-choose">570</span> | 占比<span class="percent">60%</span></span>
                        </div>
                        <div class="choice-item">
                            <span>非常满意您对我校的教学质量满意吗,司改国是会议后,检察官协会也就各项检察改革议题动了起来,由检协会制作了。司改国是会议后,检察官协会也就各项检察改革议题动了起来,由检协会制作了。</span>
                            <span class="statis">选择人数<span class="num-choose">570</span> | 占比<span class="percent">60%</span></span>
                        </div>
                        <div class="choice-item">
                            <span>非常满意</span>
                            <span class="statis">选择人数<span class="num-choose">570</span> | 占比<span class="percent">60%</span></span>
                        </div>
                    </div>
                </div>
                <div class="question-block">
                    <div class="question-title">2. 您对我校的教学质量满意吗,司改国是会议后,检察官协会也就各项检察改革议题动了起来,由检协会制作了。司改国是会议后,检察官协会也就各项检察改革议题动了起来,由检协会制作了？</div>
                    <div class="choice">
                        <div><input type="radio" name="fu" value="非常满意" title="非常满意"></div>
                        <div><input type="radio" name="fu" value="较满意" title="较满意"></div>
                        <div><input type="radio" name="fu" value="满意" title="满意"></div>
                        <div><input type="radio" name="fu" value="不满意" title="不满意"></div>
                    </div>
                </div>
            </div>

            <div class="layui-form">
                <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
                    <legend>二、毕业生跟踪调查</legend>
                </fieldset>
                <div class="question-block">
                    <div class="question-title">1. 自定义的题目？</div>
                    <div class="choice">
                        <div><input type="radio" name="dog" value="非常满意" title="非常满意"></div>
                        <div><input type="radio" name="dog" value="较满意" title="较满意"></div>
                        <div><input type="radio" name="dog" value="满意" title="满意"></div>
                        <div><input type="radio" name="dog" value="不满意" title="不满意"></div>
                        <div><input type="radio" name="dog" value="自定义" title="自定义"></div>
                    </div>
                </div>

            </div>

            <div class="layui-form">
                <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
                    <legend>三、您的意见及建议</legend>
                </fieldset>

                <table lay-filter="advises">
                    <thead>
                        <tr>
                            <th lay-data="{field:'username', width:100}">姓名</th>
                            <th lay-data="{field:'studentId', width:140, sort:true}">学号</th>
                            <th lay-data="{field:'advise',width:800}">意见及建议</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>贤心心</td>
                            <td>1156788990</td>
                            <td>人生就像是一场修行a</td>
                        </tr>
                        <tr>
                            <td>贤心2</td>
                            <td>88</td>
                            <td>人生就像是一场修行b</td>
                        </tr>
                        <tr>
                            <td>贤心3</td>
                            <td>33</td>
                            <td>人生就像是一场修行c人生就像是一场修行c人生就像是一场修行c人生就像是一场修行c人生就像是一场修行c人生就像是一场修行c人生就像是一场修行c人生就像是一场修行c人生就像是一场修行c人生就像是一场修行c人生就像是一场修行c</td>
                        </tr>

                    </tbody>
                </table>
            </div>

        </div>
    </div>
</body>
<script src="../../../../../../../../bfweb/survey/plugins/layui/layui.js"></script>
<script>
    layui.use(['form', 'table'], function () {
        var form = layui.form;
        var table = layui.table;
        table.init('advises', {
            
            page: true
            
        });
    });
</script>

</html>