class a{
    
    class b{
             void display()
             {
                 System.out.println("This is B class: ");
             }
    }
}
class MainClass{
    public static void main(String[] args) {
       a ob=new a();// First create object of outer class
       a.b o=ob.new b();// Then OuterClassName.InnerClassName object=OuterClassObject.New InnerClassname() using this way create object of inner class 
       o.display();// InnerClassObject.MethodName() 
       
    }
}
