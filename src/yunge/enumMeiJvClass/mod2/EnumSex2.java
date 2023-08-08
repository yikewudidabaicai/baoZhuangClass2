package yunge.enumMeiJvClass.mod2;

public enum EnumSex2 {
    nan("1"),nv("0");
    private String sex;

    EnumSex2(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}

