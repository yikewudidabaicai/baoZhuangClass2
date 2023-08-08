package yunge.DesionModel.JianDanGongChangModel;

/**
 * 动物工厂
 * 简单工厂模式
 */
public class AnimalFactory {
    public static Cat getCat(){
        return new Cat("哈哈",56);
    }
    public static Dog getDog(){
        return new Dog();
    }




}
