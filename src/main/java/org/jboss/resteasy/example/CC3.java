package org.jboss.resteasy.example;

public class CC3 {

   public String s;
   
   public CC3(String s) {
      this.s = s;
   }
   
   public CC3() {}
   
   public boolean equals(Object other) {
      if (!CC3.class.equals(other.getClass())) {
         return false;
      }
      CC3 cc3 = (CC3) other;
      return this.s.equals(cc3.s);
   }
}
