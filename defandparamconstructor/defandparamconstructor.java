public class defandparamconstructor {
    defandparamconstructor() {
        System.out.println("This is a Default Constructor");
    }

    defandparamconstructor(String param) {
        System.out.println("This is a" + param + "Constructor");
    }

    public static void main(String[] args) {
        defandparamconstructor defobj = new defandparamconstructor();
        defandparamconstructor paramobj = new defandparamconstructor(" Parameterized ");
    }
}
