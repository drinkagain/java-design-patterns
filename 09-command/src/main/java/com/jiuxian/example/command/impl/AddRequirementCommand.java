package com.jiuxian.example.command.impl;

import com.jiuxian.example.command.Command;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 17:04:33
 * *
 * @description: 增加需求命令
 **/
public class AddRequirementCommand extends Command {

    @Override
    public void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.requirementGroup.plan();

        super.pageGroup.find();
        super.pageGroup.add();
        super.pageGroup.plan();

        super.codeGroup.find();
        super.codeGroup.add();
        super.codeGroup.plan();
    }
}
