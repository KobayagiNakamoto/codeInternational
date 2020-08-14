/*
 * ملف: خطمخروط
 * -----------
 * يستخدم "بينما" دورة لوضع خط مخروط ثانية. هذا البرن
 * امج يعمل من أجل عالم من أي حجم.
 */
import stanford.كاريل.*;
public class خطمخروط extends كاريل {
   public void run() {
      /* يكرر حتى كاريل يواجه الجدار */
      while(frontIsClear()) {
         /* ضع مخروط على الساحة الحالية */ 
         putBeeper();
         /* move إلى المربع التالي */
         move();
      }
      /* يحل علة آخر السياج */
      putBeeper();
   }
}