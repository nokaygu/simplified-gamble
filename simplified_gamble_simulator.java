import java.util.*;
import java.io.*; 
/**
 *
 * @author berat
 */
 class tool{

static void print(ArrayList<String> list){
   try {  
            File file = new File("Table.dat");  
            if (file.createNewFile()) {  
                System.out.println("Table.dat yaratıldı");  
            } else {  
                
            }  
        } catch (IOException e) {  
        }  
     try{    
           FileWriter fw=new FileWriter("Table.dat");
           fw.write(list.get(11));fw.write(list.get(10));fw.write(list.get(9));fw.write(list.get(8));fw.write(list.get(7));fw.write(list.get(6));fw.write(list.get(5));fw.write(list.get(4));fw.write(list.get(3));fw.write(list.get(2));fw.write(list.get(1));fw.write(list.get(0)); 
              fw.write(System.getProperty( "line.separator" )); fw.write(list.get(12));fw.write(list.get(13));fw.write(list.get(14));fw.write(list.get(15));fw.write(list.get(16));fw.write(list.get(17));fw.write(list.get(18));fw.write(list.get(19));fw.write(list.get(20));fw.write(list.get(21));fw.write(list.get(22));fw.write(list.get(23));

           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("table.dat güncellendi");    
    
    
    
}

static void yarat(ArrayList<String> list){
list.add("2Y");list.add("  ");list.add("  ");list.add("  ");list.add("2X");list.add("4X");list.add("  ");list.add("2X");list.add("  ");list.add("  ");list.add("  ");list.add("5Y");
list.add("5X");list.add("  ");list.add("  ");list.add("  ");list.add("3Y");list.add("  ");list.add("5Y");list.add("  ");list.add("  ");list.add("  ");list.add("  ");list.add("2X");
}
static int cevir(String x){
if ("L1".equals(x)) return 0; if ("K1".equals(x)) return 1;if ("J1".equals(x)) return 2;if ("I1".equals(x)) return 3;if ("H1".equals(x)) return 4;if ("G1".equals(x)) return 5;if ("F1".equals(x)) return 6;if ("E1".equals(x)) return 7;if ("D1".equals(x)) return 8;if ("C1".equals(x)) return 9;if ("B1".equals(x)) return 10;if ("A1".equals(x)) return 11;
if ("A2".equals(x)) return 12; if ("B2".equals(x)) return 13;if ("C2".equals(x)) return 14;if ("D2".equals(x)) return 15;if ("E2".equals(x)) return 16;if ("F2".equals(x)) return 17;if ("G2".equals(x)) return 18;if ("H2".equals(x)) return 19;if ("I2".equals(x)) return 20;if ("J2".equals(x)) return 21;if ("K2".equals(x)) return 22;if ("L2".equals(x)) return 23;



return 0;
} 

static String xarttir(String deger){
switch(deger){
    case "  ": return "1X";
    case "1X":return "2X";
    case "2X":return "3X";
    case "3X":return "4X";
    case "4X":return "5X";
}
return " ";
}
static String yarttir(String deger){
switch(deger){
    case "  ": return "1Y";
    case "1Y":return "2Y";
    case "2Y":return "3Y";
    case "3Y":return "4Y";
    case "4Y":return "5Y";
}
return " ";
}
static String xazalt(String deger){
switch(deger){
    case "1X":return "  ";
    case "2X":return "1X";
    case "3X":return "2X";
    case "4X":return "3X";
    case "5X":return "4X";
}
return " ";
}
static String yazalt(String deger){
switch(deger){
    case "1Y":return "  ";
    case "2Y":return "1Y";
    case "3Y":return "2Y";
    case "4Y":return "3Y";
    case "5Y":return "4Y";
}
return " ";
}
static void logprint(String a){
  try {  
            File file = new File("log.dat");  
            if (file.createNewFile()) {  
                System.out.println("log.dat yaratıldı");  
            } else {  
                
            }  
        } catch (IOException e) {  
        }  
     try{    
           FileWriter fw=new FileWriter("log.dat",true);
           fw.write(a);
              fw.write(System.getProperty( "line.separator" ));
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("log.dat güncellendi");   

} 
static int zarat(){
int dice=(int)(Math.random()*6+1);

return dice;
}
static void logtemizle(){
 try {  
            File file = new File("log.dat");  
            if (file.createNewFile()) {  
                System.out.println("log.dat yaratıldı");  
            } else {  
               
            }  
        } catch (IOException e) {  
        }  
     try{    
           FileWriter fw=new FileWriter("log.dat");
          
         
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("log.dat temizlendi"); 

}
static int xoynat(ArrayList<String> list){
   Scanner scan = new Scanner(System.in);   
    String topla=" ";
 while(true ){
    System.out.println("X'in sırası, Zar Atmak için Z girin, Kapatmak için K"); 
 topla = scan.nextLine(); if(topla.equals("z")||topla.equals("Z"))break;if(topla.equals("k")||topla.equals("K")) return 0; }   
 int z1=tool.zarat();  int z2=tool.zarat(); 
 System.out.println(Integer.toString(z1)+" "+Integer.toString(z2));
tool.logprint("X"+Integer.toString(z1)+ " "+Integer.toString(z2));
while(true)
{ System.out.println("zar1 için oynayın");
     String za1=scan.nextLine();
     int zak1=tool.cevir(za1);
     int zam1=zak1-z1;String yok=list.get(zam1);
     if(zam1>= 1||yok.contains("Y")){ list.set(zam1,tool.xarttir(list.get(zam1)));
         
         break;}
         }    
    while(true)
{ System.out.println("zar2 için oynayın");
     String za2=scan.nextLine();
     int zak2=tool.cevir(za2);
     int zam2=zak2-z2;String yok=list.get(zam2);
     if(zam2>= 1||yok.contains("Y")){ list.set(zam2,tool.xarttir(list.get(zam2)));
         
         break;}
         }   
return yoynat(list);
}
static int yoynat(ArrayList<String> list){
      Scanner scan = new Scanner(System.in);   
    String topla=" ";
 while(true ){
    System.out.println("X'in sırası, Zar Atmak için Z girin, Kapatmak için K"); 
 topla = scan.nextLine(); if(topla.equals("z")||topla.equals("Z"))break;if(topla.equals("k")||topla.equals("K")) return 0; } 
int z1=tool.zarat();  int z2=tool.zarat(); 
 System.out.println(Integer.toString(z1)+" "+Integer.toString(z2));
tool.logprint("Y"+Integer.toString(z1)+ " "+Integer.toString(z2));  
   while(true)
{ System.out.println("zar1 için oynayın");
     String za1=scan.nextLine();
     int zak1=tool.cevir(za1);
     int zam1=zak1+z1; String yok=list.get(zam1);
     if(zam1<= 20||yok.contains("Y")){ list.set(zam1,tool.xarttir(list.get(zam1)));
         tool.print(list);
         break;}
         }    
    while(true)
{ System.out.println("zar2 için oynayın");
     String za2=scan.nextLine();
     int zak2=tool.cevir(za2);
     int zam2=zak2+z2;String yok=list.get(zam2);
     if(zam2<= 20||yok.contains("Y")){ list.set(zam2,tool.xarttir(list.get(zam2)));
         tool.print(list);
         break;}
         }   
    
    
    
return xoynat(list);
}


 }






public class AtmacaBerat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
ArrayList<String> list=new ArrayList<>();
Scanner scan = new Scanner(System.in);  
tool.yarat(list); tool.print(list);tool.logtemizle(); String topla=" ";

while(true ){
    System.out.println("X'in sırası, Zar Atmak için Z girin, Kapatmak için K"); 
 topla = scan.nextLine(); if(topla.equals("z")||topla.equals("Z"))break;if(topla.equals("k")||topla.equals("K")) return; }
int z1=tool.zarat(); tool.logprint(Integer.toString(z1));
topla=" ";
 while(true ){
    System.out.println("Y'nin sırası, Zar Atmak için Z girin, Kapatmak için K"); 
 topla = scan.nextLine(); if(topla.equals("z")||topla.equals("Z"))break;if(topla.equals("k")||topla.equals("K")) return; }
 int z2=tool.zarat();tool.logprint(Integer.toString(z2)); while(z1==z2){z2=tool.zarat();tool.logprint(Integer.toString(z2));}
 if(z1>z2){ System.out.println("X başladı");tool.xoynat(list);}
  if(z2>z1){ System.out.println("Y başladı");tool.yoynat(list);}

 
    }
    
}
