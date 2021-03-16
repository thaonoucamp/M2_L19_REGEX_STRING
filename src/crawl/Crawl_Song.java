package crawl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawl_Song {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");

            Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
            sc.useDelimiter("\\Z");

            String content = sc.next();
            sc.close();

            content = content.replaceAll("\\n+", "");

            Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");

            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// 1 - tao duong dan thu vien nhac bang lop URL;
// 2 - mo tream va dua no vao inputStreamReader;
// 3 - xoa tat ca new line trong content lay duoc;
// 4 - loc noi dung lay duoc va in ra danh sach bai hat theo dieu kien loc;