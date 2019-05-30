package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 11:26:22
 * *
 * @description: 现代化邮局
 **/
public class ModenPostOffice {

    private ILetterProcess letterProcess = new LetterProcessImpl();

    private Police police = new Police();

    public void sendLetter(String context, String address) {
        //帮你写信
        letterProcess.writeContext(context);
        //写好信封
        letterProcess.fillEnvelope(address);

        police.checkLetter(letterProcess);

        //把信放到信封中
        letterProcess.letterIntoEnvelope();
        //邮递信件
        letterProcess.sendLetter();
    }
}
