import Day12_Recap_Scanner_Switch_Ternary.Scanner_Next;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Self_Study {
    //day18
    //gift card 035
    //Replit 047,056 back to look


    public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3));

       ArrayList<Integer> list2=new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!list2.contains(list.get(i))){
                list2.add(list.get(i));
            }
        }

        //AAABBCCCD

        System.out.println(list2);
        ===========================
            <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>8</source>
                    <target>8</target>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.22.2</version>
                <configuration>
                    <suiteXmlFiles>
                        <suiteXmlFile>smoketest.xml</suiteXmlFile>
                    </suiteXmlFiles>
                </configuration>
            </plugin>
        </plugins>
    </build>

    }


}
