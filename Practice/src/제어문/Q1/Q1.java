class Q1{
  public static void main(String[] args){
          
          char c = '+';
          int x = 10;
          int y = 6;
          
          int result = 0;
          switch(c){
              case '+':
                    result = x + y;
                    break;
              case '-':
                    result = x - y;
                    break;
              case '*':
                    result = x * y;
                    break;
              case '/':
                    result = x / y;
                    break;
              default:
                    System.out.println("사칙연산에 기재된 기호가 아닙니다.");
                    break;
          }
          System.out.println("result:"+result);
          
  }
}
