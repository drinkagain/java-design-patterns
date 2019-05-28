package com.jiuxian.example.command.impl;

import com.jiuxian.example.command.Command;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 17:07:22
 * *
 * @description: 变更需求命令
 **/
public class ChangeRequirementCommand extends Command {

    @Override
    public void execute() {

        super.requirementGroup.find();
        super.requirementGroup.change();
        super.requirementGroup.plan();

        super.pageGroup.find();
        super.pageGroup.change();
        super.pageGroup.plan();

        super.codeGroup.find();
        super.codeGroup.change();
        super.codeGroup.plan();
    }
}
