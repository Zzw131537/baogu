package com.heima;


class Father{
    private  String name = "Father";
    public String getName() {
        return name;
    }
}
//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main  extends Father{
    private String name ="Main";
    public static void main(String[] args) {
           Main m = new Main();
           System.out.println(m.getName());
    }
}