import com.li.paperCheck.PaperCheckMain;
import com.li.paperCheck.exception.MyException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class testPaperCheck {

    @BeforeClass
    public static void beforeTest(){
        System.out.println("测试即将开始");
    }

    @AfterClass
    public static void afterTest(){
        System.out.println("测试结束");
    }

    /**
     * 测试原创论文路径为null的情况
     */
    @Test
    public void testForOriginalContextNull(){
        try {
            PaperCheckMain.process(null,"E:\\test\\orig_0.8_add.txt","E:\\test\\result.txt");
        } catch (MyException e) {
            System.out.println("输入参数不能为空！");
        }
    }

    /**
     * 测试抄袭论文路径为null的情况
     */
    @Test
    public void testForCopyContextNull(){
        try {
            PaperCheckMain.process("E:\\test\\orig.txt",null,"E:\\test\\result.txt");
        } catch (MyException e) {
            System.out.println("输入参数不能为空！");
        }
    }

    /**
     * 测试输出结果文件路径为null的情况
     */
    @Test
    public void testForResultFileAddressNull(){
        try {
            PaperCheckMain.process("E:\\test\\orig.txt","E:\\test\\orig_0.8_add.txt",null);
        } catch (MyException e) {
            System.out.println("输入参数不能为空！");
        }
    }

    /**
     * 测试输出抄袭论文为空文本的情况
     */
    @Test
    public void testForCopyContextEmptyNull(){
        try {
            PaperCheckMain.process("E:\\test\\orig.txt","E:\\test\\empty.txt","E:\\test\\result.txt");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试对比orig.txt与orig_0.8_add.txt
     */
    @Test
    public void testForCopyContextAdd(){
        try {
            PaperCheckMain.process("E:\\test\\orig.txt","E:\\test\\orig_0.8_add.txt","E:\\test\\result.txt");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试对比orig.txt与orig_0.8_del.txt
     */
    @Test
    public void testForCopyContextDel(){
        try {
            PaperCheckMain.process("E:\\test\\orig.txt","E:\\test\\orig_0.8_del.txt","E:\\test\\result.txt");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试对比orig.txt与orig_0.8_dis_1.txt
     */
    @Test
    public void testForCopyContextDis1(){
        try {
            PaperCheckMain.process("E:\\test\\orig.txt","E:\\test\\orig_0.8_dis_1.txt","E:\\test\\result.txt");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试对比orig.txt与orig_0.8_dis_10.txt
     */
    @Test
    public void testForCopyContextDis10(){
        try {
            PaperCheckMain.process("E:\\test\\orig.txt","E:\\test\\orig_0.8_dis_10.txt","E:\\test\\result.txt");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试对比orig.txt与orig_0.8_dis_15.txt
     */
    @Test
    public void testForCopyContextDis15(){
        try {
            PaperCheckMain.process("E:\\test\\orig.txt","E:\\test\\orig_0.8_dis_15.txt","E:\\test\\result.txt");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试相同文档对比
     */
    @Test
    public void testForSameContext(){
        try {
            PaperCheckMain.process("E:\\test\\orig.txt","E:\\test\\orig.txt","E:\\test\\result.txt");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试命令行参数输入错误
     */
    @Test
    public void testForErrorArgs(){
        try {
            PaperCheckMain.process("E:\\test\\orig.txt","E:\\test\\orig.txt","E:\\test\\result.txt");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }


}
