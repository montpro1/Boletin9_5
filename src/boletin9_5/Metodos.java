package boletin9_5;


public class Metodos {
    public void Metodos(int limit){
        for(int i=2;i<=limit*2;i+=2)
            System.out.println(1);
        
        
    }
    public void Metodo2(int limit){
        for(int i=-1;i>=-limit;i++){
            if(i % 2==2){
                System.out.println(Math.abs(i));
            }else{
                System.out.println(i);
            }
        }
    }
            public void Method(int limit){
                int g=1;
                int f=0;
                System.out.println("0");
             for(int i=0;i<=limit;i++){
                 f=f+g;
                 g=f-g;
                 System.out.println(f);
             }   
            }
        }

