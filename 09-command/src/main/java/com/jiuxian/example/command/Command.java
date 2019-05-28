package com.jiuxian.example.command;

import com.jiuxian.example.receiver.CodeGroup;
import com.jiuxian.example.receiver.PageGroup;
import com.jiuxian.example.receiver.RequirementGroup;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 17:03:15
 * *
 * @description: 抽象命令类
 **/
public abstract class Command {

    protected RequirementGroup requirementGroup = new RequirementGroup();

    protected PageGroup pageGroup = new PageGroup();

    protected CodeGroup codeGroup = new CodeGroup();

    public abstract void execute();
}
