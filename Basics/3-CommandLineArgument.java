// class Cmd{
//      public static void main(String cmd_input[]){

//          for(int i=0; i<cmd_input.length; i++)
//          System.out.println(cmd_input[i] +" ");
//      }
// }

class Cmd{
     public static void main(String cmd_input[]){

        int height = Integer.parseInt(cmd_input[0]);
        String color  = cmd_input[1];
        float weight = Float.parseFloat(cmd_input[2]);
        System.out.println(height + " " + color + " " + weight);  
     }
}