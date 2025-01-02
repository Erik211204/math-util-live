/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author LENOVO
 */
// ta viết cái class để cung cấp tiện ích cho nơi khác xai
// khi ta cung cấp tiện ích cho nơi khác xài, đó là lúc ta ko cần nhớ cái gì
// cho riêng ta, hàm static giúp làm điều này
public class MathUtil {
   
   //n! =  1.2.3.4.5....n
   //Quy ước: 0! = 1! = 1
   //Ko tính giai thừa cho số âm
   //20! là vừa khớp kiểu long, kiểu long tối đa 18  con số
   //21! lố kiểu long
   //nếu đưa vào âm hay 21 giai thừa, ta éo tính, ta đập vào mặt ai xài hàm này
   // 1 cái ngoại lệ, chửi éo tính được 
   public static long getFactorial(int n){
       if(n < 0 || n > 20)
           throw new IllegalArgumentException("Invalid argument. n must be between 0...20");
       // hàm dừng liền éo cần return
       
       // xuống đây là n = 0...20 ròi
       if(n == 0 || n == 1)
           return 1;   // dừng ngay khi n đặc biệt
       
       //xuống đến đây, n = 2...20 òi
       // chơi for hoặc đệ quy - recursion
       // kĩ thuật nhồi con heo đất, ốc bu dồn thịt
       // i = 2, i = 3, i = 4, i = n  nhồi liên tục i vào tích;
       long product = 1; // tích khởi đầu = 1, nhồi 2 3 4 5 6 7 8 ...n
       for (int i = 2; i <= n; i++) 
           product *= i;
       return product;
       
   }
}
