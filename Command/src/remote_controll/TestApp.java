package remote_controll;

public class TestApp {

    public static void main(String[] args) {

//        LightCommand lightCommand = new LightCommand(new Light());
//        ControllerHome ch = new ControllerHome();
//        ch.setCommand(lightCommand);
//        ch.pressButtonRun();
//        ch.pressButtonUndo();
//        ch.pressButtonRedo();
//        ch.resetBtnController();
//
//        TVCommand tvCommand = new TVCommand(new TV());
//        ch.setCommand(tvCommand);
//        ch.pressButtonRun();
//        ch.pressButtonUndo();
//        ch.pressButtonUndo(); //trebamo pamtiti povijest nekako, stog?

        ControllerHome controllerHome = new ControllerHome();
        controllerHome.setCommand(new TVCommand(new TV()));
        controllerHome.pressButtonRun();
        controllerHome.pressButtonUndo();
        controllerHome.pressButtonUndo();


    }

}
