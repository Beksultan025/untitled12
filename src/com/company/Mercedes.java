package com.company;

public final class Mercedes extends Car{
    private Model model;
    private EnumColor enumColor;

    public Model getModel() {
        return model;
    }

    public EnumColor getEnumColor() {
        return enumColor;
    }

    @Override
    public void makeVoice() {
        System.out.println("БРУМММ БРУМММ");
    }
}
