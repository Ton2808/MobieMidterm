package com.example.bookhubapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.bookhubapp.Adapter.CategoryBookListAdapter;
import com.example.bookhubapp.Adapter.PopularAdapter;
import com.example.bookhubapp.Domain.BookDomain;
import com.example.bookhubapp.Domain.CategoryDomain;
import com.example.bookhubapp.Helper.ManagementCart;
import com.example.bookhubapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class ShowCategoryActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView  recyclerViewCategoryBookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_category);

        Bundle extras = getIntent().getExtras();
        String category_name = extras.getString("Category Name");
        TextView cat_name = findViewById(R.id.category_name);
        cat_name.setText(category_name);

        recyclerViewPopular(category_name);
    }

    private void recyclerViewPopular(String category_name){
        recyclerViewCategoryBookList = findViewById(R.id.category_recycler);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerViewCategoryBookList.setLayoutManager(layoutManager);

        ArrayList<BookDomain> bookList = new ArrayList<>();
        bookList.add(new BookDomain("Cuộc phiêu lưu", "adventures_finn", "Sau những cuộc phiêu lưu cùng Tom Sawyer, Huck Finn được bà quả phụ Douglas đón về nuôi. Nhưng với bản tính ưa tự do, Huck không chịu nổi việc phải ăn vận sạch sẽ, học hành theo khuôn phép trưởng giả dù được sống giàu sang. Cộng thêm với việc người cha tưởng đã chết  đột ngột trở về tiếp tục hành hạ, gây rắc rối cho cậu, Huck quyết định cùng Jim – một nô lệ da đen bỏ trốn – cùng xuôi dòng Mississippi, bắt đầu những cuộc phiêu lưu mới.\n" +
                "\n" +
                "Nhiều chuyện dở khóc dở cười đã xảy ra trong chuyến phiêu lưu. Không chỉ thế, Huck còn lâm vào những tình huống nguy hiểm khi bị cuốn vào cuộc tranh chấp giữa hai dòng họ với những cuộc đọ súng chết chóc... Nhưng cũng chính trong hoàn cảnh ngặt nghèo nhất, Huck đã nhận ra giá trị của cuộc sống để hướng về sự tự do và hết lòng giúp đỡ người nô lệ da đen tội nghiệp. Từ một cậu bé chỉ biết phá phách, Huck đã xác định rõ ràng mục đích sống, biết phân biệt đúng sai bằng trái tim thuần hậu và thoát khỏi những định kiến méo mó được nhồi nhét qua cách giáo dục sai trái.", 85000.0, "Tiểu thuyết"));
        bookList.add(new BookDomain("Anna Karenina", "anna_kare", "Anna Karenina được xem như là một đỉnh cao của tiểu thuyết hiện thực. Nhân vật chính trong truyện Anna Karenina được Tolstoy sáng tác dựa vào Maria Aleksandrovna Hartung, người con gái lớn của đại thi hào Aleksandr Sergeyevich Pushkin. Sau khi gặp cô ở một bữa ăn tối, ông bắt đầu đọc truyện viết dở dang của Puskin: Những người khách họp mặt trong biệt thự, Tolstoy nảy ra ý định viết Anna Karenina.\n" +
                "\n" +
                "Theo một cuộc thăm dò gần đây, dựa trên ý kiến của 125 nhà văn nổi tiếng đương thời, tiểu thuyết Anna Karenina là tác phẩm có số phiếu bầu cao nhất trong danh sách 10 tác phẩm vĩ đại nhất mọi thời đại.", 132000.0, "Tiểu thuyết"));
        bookList.add(new BookDomain("Đại Gia Gatsby", "great_gatsby", "\"Gatsby đã tin vào đốm sáng xanh ấy, vào cái tương lai mê đắm đến cực điểm đang rời xa trước mắt chúng ta năm này qua năm khác. Ừ thì nó đã tuột khỏi tay chúng ta, nhưng có làm sao đâu – ngày mai chúng ta sẽ lại chạy nhanh hơn, vươn tay ra xa hơn…”\n" +
                "\n" +
                "Là bức chân dung của “Thời đại Jazz” (Jazz Age, cái tên do chính Fitzgerald đặt cho thời kỳ 1918 - 1929), đại gia Gatsby nắm bắt vô cùng sâu sắc tinh thần của thế hệ cùng thời ông: những ám ảnh thường trực về thành đạt, tiền bạc, sang trọng, dư dật, hào nhoáng; song đồng thời là nỗi âu lo trước thói sùng bái vật chất vô độ và sự thiếu vắng đạo đức đang ngày một lên ngôi. Phất lên nhanh chóng từ chỗ “hàn vi”, Gatsby, nhân vật chính của câu chuyện, những tưởng sẽ có tất cả - tiền bạc, quyền lực, và sau rốt là tình yêu -, nhưng rồi ảo tưởng tình yêu đó tan vỡ thật đau đớn, theo sau là cái chết tức tưởi của Gatsby, để cuối cùng lập tức bị người đời quên lãng. Là lời cảnh tỉnh để đời của Scott Fitzgerald về cái gọi là “Giấc mơ Mỹ”, Đại gia Gatsby được ví như một tượng đài văn học, một cánh cửa cần mở ra cho những ai quan tâm tới văn học và lịch sử tinh thần nước Mỹ thời hiện đai.\n" +
                "\n" +
                "Đại gia Gatsby (The Great Gatsby) từ lâu đã được đưa vào giảng dạy trong trường phổ thông và đại học ở nhiều nước trên thế giới. Cuốn tiểu thuyết “khác thường, tuyệt đẹp, cấu trúc phức tạp song trên hết là giản dị” (như lời chính nhà văn) đứng thứ hai trong danh sách 100 tiểu thuyết hay nhất thế kỷ 20 của Modern Library, và nằm trong danh sách 100 tiểu thuyết hay nhất bằng tiếng Anh từ 1923 đến 2005 do tạp chí Time bình chọn.", 68000.0, "Tiểu thuyết"));
        bookList.add(new BookDomain("Kiêu Hãnh Và Định Kiến", "kieuhanh_dinhkien", "Khắp làng trên xóm dưới Herfordshire xôn xao: Netherfield sắp có người thuê, mà còn là một quý ông chưa vợ với khoản lợi tức lên đến năm nghìn bảng mỗi năm. Chao ôi, quả là tin đáng mừng đối với gia đình ông bà Bennett, vốn có tới năm cô con gái cần phải gả chồng. Giữa những quay cuồng vũ hội cùng âm mưu toan tính của cả một xã hội ganh đua nhau tìm tấm chồng tốt cho các cô gái, nổi lên câu chuyện tình của cô con gái thứ cứng đầu Elizabeth và chàng quý tộc Darcy - nơi lòng Kiêu hãnh phải nhún nhường và Định kiến cần giải tỏa để có thể đi đến kết cục hoàn toàn viên mãn.\n" +
                "Suốt hơn 200 năm qua, Kiêu hãnh và Định kiến luôn nằm trong số những tiểu thuyết tiếng Anh được yêu mến nhất. Chính Jane Austen cũng coi tác phẩm xuất sắc này là “đứa con cưng” của bà. Tài năng của Austen quả thực đã biến câu chuyện tình sôi nổi nơi miền quê nước Anh thành một bản châm biếm sắc sảo hóm hỉnh và một viên ngọc quý trong kho tàng Anh ngữ.", 98000.0, "Tiểu thuyết"));
        bookList.add(new BookDomain("Cây Cam Ngọt Của Tôi", "caycamngot", "Hãy làm quen với Zezé, cậu bé tinh nghịch siêu hạng đồng thời cũng đáng yêu bậc nhất, với ước mơ lớn lên trở thành nhà thơ cổ thắt nơ bướm. Chẳng phải ai cũng công nhận khoản “đáng yêu” kia đâu nhé. Bởi vì, ở cái xóm ngoại ô nghèo ấy, nỗi khắc khổ bủa vây đã che mờ mắt người ta trước trái tim thiện lương cùng trí tưởng tượng tuyệt vời của cậu bé con năm tuổi.\n" +
                "\n" +
                "Có hề gì đâu bao nhiêu là hắt hủi, đánh mắng, vì Zezé đã có một người bạn đặc biệt để trút nỗi lòng: cây cam ngọt nơi vườn sau. Và cả một người bạn nữa, bằng xương bằng thịt, một ngày kia xuất hiện, cho cậu bé nhạy cảm khôn sớm biết thế nào là trìu mến, thế nào là nỗi đau, và mãi mãi thay đổi cuộc đời cậu.\n" +
                "Mở đầu bằng những thanh âm trong sáng và kết thúc lắng lại trong những nốt trầm hoài niệm, Cây cam ngọt của tôi khiến ta nhận ra vẻ đẹp thực sự của cuộc sống đến từ những điều giản dị như bông hoa trắng của cái cây sau nhà, và rằng cuộc đời thật khốn khổ nếu thiếu đi lòng yêu thương và niềm trắc ẩn. Cuốn sách kinh điển này bởi thế không ngừng khiến trái tim người đọc khắp thế giới thổn thức, kể từ khi ra mắt lần đầu năm 1968 tại Brazil.", 70000.0, "Tiểu thuyết"));
        bookList.add(new BookDomain("Người Đua Diều", "nguoiduadieu", "Câu chuyện là lời tự thuật của nhà văn người Mỹ gốc Afghanistan Amir về những năm tháng tuổi thơ đầy niềm vui cũng như lỗi lầm, về những ngày trôi dạt trên đất khách rồi cuộc hành trình trở lại quê hương đổ nát để cứu chuộc tội lỗi cho bản thân và cho cả người cha đã khuất. Theo dòng hồi ức của Amir, người đọc trở lại hơn hai mươi năm về trước, khi Amir còn là một cậu bé mười hai tuổi sống trong vòng tay che chở của Baba giàu sang và thanh thế. Cùng gắn bó với Amir suốt những năm tháng tuổi thơ là Hassan, con trai của người quản gia Ali, một cậu bé lanh lợi, mạnh mẽ nhiều lần xả thân để bảo vệ Amir. Thế nhưng tình bạn và lòng tận tụy của Hassan đã không được đền đáp, một ngày mùa đông năm 1975, Hassan vì ra sức bảo vệ chiếc diều xanh chiến lợi phẩm của Amir đã bị bọn trẻ xấu hành hung và nhục mạ. Sự nhu nhược và hèn nhát đã cản bước Amir cứu bạn, thậm chí, còn biến cậu thành một kẻ gian dối khi bịa chuyện nhằm đuổi cha con Ali và Hassan ra khỏi nhà. Và Amir đã phải trả giá cho lỗi lầm ấy trong suốt phần đời còn lại. Ngay cả khi anh đang sống sung túc trên đất Mỹ, ngay cả khi tìm được một mái ấm cho riêng mình hay thực hiện được mơ ước trở thành nhà văn, nỗi ám ảnh của một kẻ gian dối vẫn ngày đêm đeo đuổi Amir. Và cuối cùng, trở lại Afghanistan để cứu con trai Hassan khỏi tay bọn Taliban là con đường duy nhất để Amir chuộc lỗi với người bạn, người em cùng cha khác mẹ Hassan đã chết dưới họng súng Taliban.\n" +
                "\n" +
                "Người đua diều có đầy đủ các yếu tố cần thiết để trở thành một tác phẩm best-seller: tính thời sự, cốt truyện ly kỳ, xúc động, xung đột gay gắt giữa các tuyến nhân vật, trong chính bản thân nhân vật… Và sự thật, tác phẩm đã nắm giữ vị trí đầu bảng của The New York Times trong 110 tuần. Ngoài những khía cạnh trên, sức hấp dẫn của Người đua diều còn bắt nguồn từ giá trị nhận thức sâu sắc.", 150000.0, "Tiểu thuyết"));
        bookList.add(new BookDomain("Rừng Nauy", "rungnauy", "Câu chuyện bắt đầu từ một chuyến bay trong ngày mưa ảm đạm, một người đàn ông 37 tuổi chợt nghe thấy bài hát gắn liền với hình ảnh người yêu cũ, thế là quá khứ ùa về xâm chiếm thực tại. Mười tám năm trước, người đàn ông ấy là chàng Toru Wanatabe trẻ trung, mỗi chủ nhật lại cùng nàng Naoko lang thang vô định trên những con phố Tokyo. Họ sánh bước bên nhau để thấy mình còn sống, còn tồn tại, và gắng gượng tiếp tục sống, tiếp tục tồn tại sau cái chết của người bạn cũ Kizuki. Cho đến khi Toru nhận ra rằng mình thực sự yêu và cần có Naoko thì cũng là lúc nàng không thể chạy trốn những ám ảnh quá khứ, không thể hòa nhập với cuộc sống thực tại và trở về dưỡng bệnh trong một khu trị liệu khép kín. Toru, bên cạnh giảng đường vô nghĩa chán ngắt, bên cạnh những đêm chơi bời chuyển từ cảm giác thích thú đến uể oải, ghê tởẫn kiên nhẫn chờ đợi và hy vọng vào sự hồi phục của Naoko. Cuối cùng, những lá thư, những lần thăm hỏi, hồi ức về lần ân ái duy nhất của Toru không thể níu Naoko ở lại, nàng chọn cái chết như một lối đi thanh thản. Từ trong mất mát, Toru nhận ra rằng mình cần tiếp tục sống và bắt đầu tình yêu mới với Midori.\n" +
                "\n" +
                "Một cuốn sách ẩn chứa mọi điều khiến bạn phải say mê và đau đớn, tình yêu với muôn vàn màu sắc và cung bậc khác nhau, cảm giác trống rỗng và hẫng hụt của cả một thế hệ thanh niên vô hướng, ý niệm về sự sinh tồn tất yếu của cái chết trong lòng cuộc sống, những gắng gượng âm thầm nhưng quyết liệt của con người để vượt qua mất mát trong đờất cả đã tạo nên vẻ đẹp riêng cho \"Rừng Na uy\", im lặng, ma thuật và tuyệt vọng như một chấm máu cô độc giữa bạt ngàn tuyết lạnh.", 90000.0, "Tiểu thuyết, Viễn tưởng"));
        bookList.add(new BookDomain("Kafka bên bờ biển", "kafkabobien", "Kafka Tamura, mười lăm tuổi, bỏ trốn khỏi nhà ở Tokyo để thoát khỏi lời nguyền khủng khiếp mà người cha đã giáng xuống đầu mình.Ở phía bên kia quần đảo, Nakata, một ông già lẩm cẩm cùng quyết định dấn thân. Hai số phận đan xen vào nhau để trở thành một tấm gương phản chiếu lẫn nhau. Trong khi đó, trên đường đi, thực tại xào xạc lời thì thầm quyến rũ. Khu rừng đầy những người linh vừa thoát khỏi cuộc chiến tranh vừa qua, cá mưa từ trên trời xuống và gái điếm trích dẫn Hegel. Kafka bên bờ biển, câu chuyện hoang đường mở đầu thế kỷ XXI, cho chúng ta đắm chìm trong một chuyến du hành đầy sóng gió đầy chất hiện đại và mơ mộng trong lòng Nhật Bản đương đại.\n" +
                "\n" +
                "Haruki Murakami, nhà văn Nhật đương đại nổi tiếng với những tác phẩm như Rừng Nauy; Xứ sở kỳ diệu vô tình và Nơi tận cùng thế giới; Phía Nam biên giới, Phía Tây mặt trời; Người tình Sputnik, Biên niên ký chim vặn dây cót và Kafka bên bờ biển.", 118800.0, "Tiểu thuyết, Viễn tưởng"));
        bookList.add(new BookDomain("Mắt Biếc", "matbiec", "Mắt biếc là một tác phẩm được nhiều người bình chọn là hay nhất của nhà văn Nguyễn Nhật Ánh. Tác phẩm này cũng đã được dịch giả Kato Sakae dịch sang tiếng Nhật để giới thiệu với độc giả Nhật Bản.\n" +
                "\n" +
                "“Tôi gửi tình yêu cho mùa hè, nhưng mùa hè không giữ nổi. Mùa hè chỉ biết ra hoa, phượng đỏ sân trường và tiếng ve nỉ non trong lá. Mùa hè ngây ngô, giống như tôi vậy. Nó chẳng làm được những điều tôi ký thác. Nó để Hà Lan đốt tôi, đốt rụi. Trái tim tôi cháy thành tro, rơi vãi trên đường về.”\n" +
                "\n" +
                "… Bởi sự trong sáng của một tình cảm, bởi cái kết thúc buồn, rất buồn khi xuyên suốt câu chuyện vẫn là những điều vui, buồn lẫn lộn… \n" +
                "\n" +
                "Mắt biếc là một tác phẩm được nhiều người bình chọn là hay nhất của nhà văn Nguyễn Nhật Ánh. Tác phẩm này cũng đã được dịch giả Kato Sakae dịch sang tiếng Nhật để giới thiệu với độc giả Nhật Bản.\n" +
                "\n" +
                "“Tôi gửi tình yêu cho mùa hè, nhưng mùa hè không giữ nổi. Mùa hè chỉ biết ra hoa, phượng đỏ sân trường và tiếng ve nỉ non trong lá. Mùa hè ngây ngô, giống như tôi vậy. Nó chẳng làm được những điều tôi ký thác. Nó để Hà Lan đốt tôi, đốt rụi. Trái tim tôi cháy thành tro, rơi vãi trên đường về.”\n" +
                "\n" +
                "… Bởi sự trong sáng của một tình cảm, bởi cái kết thúc buồn, rất buồn khi xuyên suốt câu chuyện vẫn là những điều vui, buồn lẫn lộn… ", 82000.0, "Tiểu thuyết, Ngôn tình"));
        bookList.add(new BookDomain("Định Mệnh Dưới Mưa", "dinhmenh", "Khoảnh khắc này cô mới hiểu, bản thân cô chọn một người như anh, bởi vì mỗi khi ở bên cạnh anh, cô luôn có thể làm chính mình.\n" +
                "\n" +
                "Anh rất giống một rừng cây, hiu quạnh, trống trải, không có gì cả. Khi không có ánh đèn phồn hoa, ánh mặt trời mới thật sự ấm áp. Khi không có tiếng người cười nói ồn ào, dòng nước mới thật sự trong veo, tĩnh mịch. Cuối cùng cô đã tìm được một người như vậy, một người để cô có thể làm những điều mà thẳm sâu trong lòng cô luôn ước ao, nhẹ nhõm, chân thành, thẳng thắn.", 179000.0, "Ngôn tình"));
        bookList.add(new BookDomain("Mãi Mãi Là Bao Xa", "maimai", "Bạch Lăng Lăng, nữ sinh khoa Điện khí, trẻ trung, xinh đẹp và rất tự hào khi quen được một người bạn lý tưởng qua mạng, chàng du học sinh của một trường nổi tiếng của Mỹ, người mang biệt danh “nhà khoa học”: Mãi Mãi Là Bao Xa. Qua những cuộc chuyện trò trên QQ, Lăng Lăng đã gắn bó với chàng trai đó lúc nào cô cũng không hay, cảm xúc lớn dần, sự chia sẻ lớn dần và đến một ngày cô phát hiện ra mình đã yêu người con trai “tài giỏi” và không một chút khuyết điểm ấy.\n" +
                "\n" +
                "Nhưng sự tỉnh táo giúp cô ý thức được rằng, thế giới mạng chỉ là ảo, họ ở cách nhau cả một đại dương mênh mông, anh lại quá xuất sắc và ưu tú, mối quan hệ của họ sẽ không có kết quả gì. Nhất là khi anh thông báo, nếu anh tiếp tục sự nghiệp nghiên cứu lần này, rất có thể anh phải định cư bên Mỹ, mãi mãi không trở về. Khi nghe tin đó, cô đã gục xuống trước màn hình máy tính và khóc. Tất cả như sụp đổ, tia hy vọng cuối cùng dập tắt, anh sẽ không về nước nữa, khoảng cách giữa họ là mãi mãi… Cô cay đắng nói với anh lời từ biệt và đưa nick của anh vào danh sách đen, không bao giờ xuất hiện khi cô đăng nhập QQ nữa…\n" +
                "\n" +
                "Một năm trôi qua, Lăng Lăng tưởng đã quên đi “nhà khoa học” ở bên kia thế giới của mình, bên cô đã có Uông Đào, bạn trai, người mang lại cho cô cảm giác an toàn, người cô muốn lấy làm chồng dù cảm xúc dành cho anh chưa hẳn là tình yêu. Cô bảo vệ đề án tốt nghiệp, Uông Đào luôn quấn quýt bên cô… Và điều bất ngờ trong buổi bảo vệ đề án, Dương Lam Hàng, một giảng viên trẻ vừa trở về từ MIT, trường đại học danh tiếng của Mỹ, xuất thân từ một gia đình danh giá, đã tới tham dự buổi bảo vệ của cô và đưa ra những câu hỏi phản biện thật “khó chịu”.\n" +
                "\n" +
                "Với cô, Tất cả các nữ sinh trong trường đều ngưỡng mỗ và ao ước được trở thành bóng hồng trong trái tim của Dương Lam Hàng, nhưng với cô, đó đúng là ông thầy “biến thái”. Sự trớ trêu của số phận đun đẩy khiến cô ngày càng tiếp xúc với anh nhiều hơn, và chính anh là người gợi ý và nâng đỡ cho cô học tiếp thạc sĩ để có cơ hội ở lại trường.\n" +
                "\n" +
                "Trở thành học viên của khoa Vật liệu, bao thách thức và khó khăn chờ đón cô, dưới sự dìu dắt và yêu cầu quá cao của thầy hướng dẫn, cô dần dần làm quen với công việc… Những buổi thảo luận, những lần thí nghiệm, những sự giúp đỡ, những lời quan tâm chân thành, và cộng thêm vẻ ngoài lạnh lùng, điễm tĩnh, rất đẹp của Dương Lam Hàng, trái tim Lăng Lăng cũng xao động.\n" +
                "\n" +
                "Một bên là người gần gũi với cô hằng ngày, chăm lo cho cô, nâng đỡ cô từng chút một, một bên là chàng trai ở mãi tận nơi xa, chưa một lần gặp mặt. Lăng Lăng giằng xé và không biết trái tim mình nghiêng về bên nào nhiều hơn. Đến khi cảm xúc vỡ òa, cô quyết định dừng học bởi không muốn gặp người thầy đã chiếm giữ vị trí trong trái tim cô, cô muốn chung thủy với tình cảm cho chàng trai Mãi Mãi Là Bao Xa, người chia sẻ và dành cho cô tình cảm chân thành, thì cũng là lúc cô phát hiện ra hình như Dương Lam Hàng và người cô yêu có thật nhiều điểm tương đồng. Mãi Mãi Là Bao Xa nói anh đã về nước và sẽ đến gặp cô… Vậy người thầy bên cô bấy lâu nay là ai?\n" +
                "\n" +
                "Bạch Lăng Lăng, nữ sinh khoa Điện khí, trẻ trung, xinh đẹp và rất tự hào khi quen được một người bạn lý tưởng qua mạng, chàng du học sinh của một trường nổi tiếng của Mỹ, người mang biệt danh “nhà khoa học”: Mãi Mãi Là Bao Xa. Qua những cuộc chuyện trò trên QQ, Lăng Lăng đã gắn bó với chàng trai đó lúc nào cô cũng không hay, cảm xúc lớn dần, sự chia sẻ lớn dần và đến một ngày cô phát hiện ra mình đã yêu người con trai “tài giỏi” và không một chút khuyết điểm ấy.\n" +
                "\n" +
                "Nhưng sự tỉnh táo giúp cô ý thức được rằng, thế giới mạng chỉ là ảo, họ ở cách nhau cả một đại dương mênh mông, anh lại quá xuất sắc và ưu tú, mối quan hệ của họ sẽ không có kết quả gì. Nhất là khi anh thông báo, nếu anh tiếp tục sự nghiệp nghiên cứu lần này, rất có thể anh phải định cư bên Mỹ, mãi mãi không trở về. Khi nghe tin đó, cô đã gục xuống trước màn hình máy tính và khóc. Tất cả như sụp đổ, tia hy vọng cuối cùng dập tắt, anh sẽ không về nước nữa, khoảng cách giữa họ là mãi mãi… Cô cay đắng nói với anh lời từ biệt và đưa nick của anh vào danh sách đen, không bao giờ xuất hiện khi cô đăng nhập QQ nữa…\n" +
                "\n" +
                "Một năm trôi qua, Lăng Lăng tưởng đã quên đi “nhà khoa học” ở bên kia thế giới của mình, bên cô đã có Uông Đào, bạn trai, người mang lại cho cô cảm giác an toàn, người cô muốn lấy làm chồng dù cảm xúc dành cho anh chưa hẳn là tình yêu. Cô bảo vệ đề án tốt nghiệp, Uông Đào luôn quấn quýt bên cô… Và điều bất ngờ trong buổi bảo vệ đề án, Dương Lam Hàng, một giảng viên trẻ vừa trở về từ MIT, trường đại học danh tiếng của Mỹ, xuất thân từ một gia đình danh giá, đã tới tham dự buổi bảo vệ của cô và đưa ra những câu hỏi phản biện thật “khó chịu”.\n" +
                "\n" +
                "Với cô, Tất cả các nữ sinh trong trường đều ngưỡng mỗ và ao ước được trở thành bóng hồng trong trái tim của Dương Lam Hàng, nhưng với cô, đó đúng là ông thầy “biến thái”. Sự trớ trêu của số phận đun đẩy khiến cô ngày càng tiếp xúc với anh nhiều hơn, và chính anh là người gợi ý và nâng đỡ cho cô học tiếp thạc sĩ để có cơ hội ở lại trường.\n" +
                "\n" +
                "Trở thành học viên của khoa Vật liệu, bao thách thức và khó khăn chờ đón cô, dưới sự dìu dắt và yêu cầu quá cao của thầy hướng dẫn, cô dần dần làm quen với công việc… Những buổi thảo luận, những lần thí nghiệm, những sự giúp đỡ, những lời quan tâm chân thành, và cộng thêm vẻ ngoài lạnh lùng, điễm tĩnh, rất đẹp của Dương Lam Hàng, trái tim Lăng Lăng cũng xao động.\n" +
                "\n" +
                "Một bên là người gần gũi với cô hằng ngày, chăm lo cho cô, nâng đỡ cô từng chút một, một bên là chàng trai ở mãi tận nơi xa, chưa một lần gặp mặt. Lăng Lăng giằng xé và không biết trái tim mình nghiêng về bên nào nhiều hơn. Đến khi cảm xúc vỡ òa, cô quyết định dừng học bởi không muốn gặp người thầy đã chiếm giữ vị trí trong trái tim cô, cô muốn chung thủy với tình cảm cho chàng trai Mãi Mãi Là Bao Xa, người chia sẻ và dành cho cô tình cảm chân thành, thì cũng là lúc cô phát hiện ra hình như Dương Lam Hàng và người cô yêu có thật nhiều điểm tương đồng. Mãi Mãi Là Bao Xa nói anh đã về nước và sẽ đến gặp cô… Vậy người thầy bên cô bấy lâu nay là ai?", 128000.0, "Ngôn tình"));
        bookList.add(new BookDomain("Eo Thon Nhỏ", "eothon", "Lục Trì hiểu ý Đường Nhân, môi cậu khẽ nhếch lên. Đường Nhân nheo mắt. “Sau này phải cười nhiều vào đấy! Cậu cười lên trông đẹp trai lắm.”\n" +
                "\n" +
                "Nụ cười “thầm kín” của Lục Trì tắt phụt. Cô cười, để lộ hàm răng trắng tinh. “Vừa nãy tớ uống nước mật ong, nước mật ong ngọt ê răng luôn ấy.”\n" +
                "\n" +
                "Lục Trì nhìn cô. Hai chuyện này thì liên quan gì tới nhau? Đường Nhân bồi thêm: “Nụ cười của cậu… còn ngọt hơn mật ong tớ uống hôm nay.”", 227000.0, "Tiểu thuyết, Ngôn tình"));
        bookList.add(new BookDomain("Phía Sau Nghi Can X", "phiasau", "“Việc nghĩ ra một bài toán vô cùng khó và việc giải bài toán đó, việc nào khó hơn?”\n" +
                "Khi nhấn chuông cửa nhà nghi can chính của một vụ án mới, điều tra viên Kusanagi không biết rằng anh sắp phải đương đầu với một thiên tài ẩn dật. Kusanagi càng không thể ngờ rằng, chỉ một câu nói vô thưởng vô phạt của anh đã kéo người bạn thân, Manabu Yukawa, một phó giáo sư vật lý tài năng, vào vụ án. Và điều làm sững sờ nhất, đó là vụ án kia chẳng qua cũng chỉ như một bài toán cấp ba đơn giản, tuy nhiên ấn số X khi được phơi bày ra lại không đem đến hạnh phúc cho bất cứ ai…\n" +
                "\n" +
                "Với một giọng văn tỉnh táo và dung dị, Higashino Keigo đã đem đến cho độc giả hơn cả một cuốn tiểu thuyết trinh thám. Mô tả tội ác không phải điều hấp dẫn nhất ở đây, mà còn là những giằng xé nội tâm thầm kín, những nhân vật bình dị, và sự quan tâm sâu sa tới con người. Tác phẩm đã đem lại cho Higashino Keigo Giải Naoki lần thứ 134, một  giải thưởng văn học lâu đời sánh ngang giải Akutagawa tại Nhật.\n" +
                "\n" +
                "*****\n" +
                "“Cuốn tiểu thuyết độc đáo ở chỗ ngay từ đầu nó đã vẽ ra toàn cảnh câu chuyện, bạn có thể dễ dàng biết ai là thủ phạm, nhưng cách thức phạm tội của thủ phạm mới là vấn đề. Liệu bạn có dám chắc mình không sa vào cái bẫy của tư duy logic?” - Richard Lim Jr - Xclusive.com\n" +
                "\n" +
                "“Dẫu không có những tình tiết gay cấn đến nghẹt thở nhưng người đọc chắc chắn sẽ thấy thỏa mãn với cuốn sách này. Không chỉ là một cuốn tiểu thuyết trinh thám thông thường, Phía sau nghi can X còn là một câu chuyện về tình yêu, về mối quan hệ khăng khít nhưng vô cùng khắc nghiệt giữa lý trí và tình cảm trong một con người. Qua đó, ta cũng tự đặt ra cho chính mình một câu hỏi, ‘Vì tình yêu, con người ta có thể đi xa đến đâu?’” - Stefan S - A Nutshell Review\n" +
                "\n" +
                "“Phía sau nghi can X gây hứng thú cho người đọc bởi nó khác rất nhiều so với những cuốn trinh thám thông thường. Thay vì tập trung miêu tả tội ác, cuốn tiểu thuyết chú trọng hơn vào con người, những mối quan hệ kỳ lạ và hoàn cảnh éo le của từng nhân vật. Càng thú vị hơn nữa, câu chuyện đầy tính nhân văn này lại được mô tả dưới góc nhìn đầy lý trí của toán học và vật lý.” - Sophia Lee – Phoenix Plume\n" +
                "“Việc nghĩ ra một bài toán vô cùng khó và việc giải bài toán đó, việc nào khó hơn?”\n" +
                "Khi nhấn chuông cửa nhà nghi can chính của một vụ án mới, điều tra viên Kusanagi không biết rằng anh sắp phải đương đầu với một thiên tài ẩn dật. Kusanagi càng không thể ngờ rằng, chỉ một câu nói vô thưởng vô phạt của anh đã kéo người bạn thân, Manabu Yukawa, một phó giáo sư vật lý tài năng, vào vụ án. Và điều làm sững sờ nhất, đó là vụ án kia chẳng qua cũng chỉ như một bài toán cấp ba đơn giản, tuy nhiên ấn số X khi được phơi bày ra lại không đem đến hạnh phúc cho bất cứ ai…\n" +
                "\n" +
                "Với một giọng văn tỉnh táo và dung dị, Higashino Keigo đã đem đến cho độc giả hơn cả một cuốn tiểu thuyết trinh thám. Mô tả tội ác không phải điều hấp dẫn nhất ở đây, mà còn là những giằng xé nội tâm thầm kín, những nhân vật bình dị, và sự quan tâm sâu sa tới con người. Tác phẩm đã đem lại cho Higashino Keigo Giải Naoki lần thứ 134, một  giải thưởng văn học lâu đời sánh ngang giải Akutagawa tại Nhật.\n" +
                "\n" +
                "*****\n" +
                "“Cuốn tiểu thuyết độc đáo ở chỗ ngay từ đầu nó đã vẽ ra toàn cảnh câu chuyện, bạn có thể dễ dàng biết ai là thủ phạm, nhưng cách thức phạm tội của thủ phạm mới là vấn đề. Liệu bạn có dám chắc mình không sa vào cái bẫy của tư duy logic?” - Richard Lim Jr - Xclusive.com\n" +
                "\n" +
                "“Dẫu không có những tình tiết gay cấn đến nghẹt thở nhưng người đọc chắc chắn sẽ thấy thỏa mãn với cuốn sách này. Không chỉ là một cuốn tiểu thuyết trinh thám thông thường, Phía sau nghi can X còn là một câu chuyện về tình yêu, về mối quan hệ khăng khít nhưng vô cùng khắc nghiệt giữa lý trí và tình cảm trong một con người. Qua đó, ta cũng tự đặt ra cho chính mình một câu hỏi, ‘Vì tình yêu, con người ta có thể đi xa đến đâu?’” - Stefan S - A Nutshell Review\n" +
                "\n" +
                "“Phía sau nghi can X gây hứng thú cho người đọc bởi nó khác rất nhiều so với những cuốn trinh thám thông thường. Thay vì tập trung miêu tả tội ác, cuốn tiểu thuyết chú trọng hơn vào con người, những mối quan hệ kỳ lạ và hoàn cảnh éo le của từng nhân vật. Càng thú vị hơn nữa, câu chuyện đầy tính nhân văn này lại được mô tả dưới góc nhìn đầy lý trí của toán học và vật lý.” - Sophia Lee – Phoenix Plume", 103000.0, "Trinh thám"));
        bookList.add(new BookDomain("Thiên Thần Và Ác Quỷ", "thienthan", "Robert Langdon giáo sư biểu tượng học của Harvard, được bí mật mời tới trung tâm nghiên cứu Hạt nhân Châu Âu – cơ quan nghiên cứu khoa học lớn nhất thế giới – để làm sáng tỏ cái chết của nhà vật lý học Leonardo Vetra. Biểu tượng bí ẩn được đóng dấu sắt nung trên ngực thi thể đưa đến một kết luận duy nhất: Hung thủ chính là  Illuminati – một hội kín tưởng chừng như đã tàn lụi từ 400 năm trước. Dường như hội kín vô cùng quyền lực này đã trở lại để tiếp tục cuộc báo thù nhằm vào nhà thờ công giáo, kẻ thù truyền kiếp của mình.\n" +
                "\n" +
                "Phản vật chất – công trình nghiên cứu nhà vật lý học quá cố cùng cô con gái nuôi Vittoria Vetra bỗng chốc trở thành mối đe dọa cực kỳ nghiêm trọng đối với thành Rome cũng như giáo hội Vatican trong đêm Mật nghị Hồng y. Bốn vị Hồng y, những ứng cứ viên cho chức vụ Giáo hoàng lần lượt bị bắt cóc ngay trước thềm Mật nghị, Robert Langdon cùng nữ khoa học gia quyến rũ Vittoria Vetra phải chạy đua với thời gian để tìm kiếm bốn vị Hồng y mất tích cùng hộp phản vật chất bị đánh cắp.\n" +
                "\n" +
                "“Thiên thần và Ác Quỷ luôn ngự trị trong mỗi con người, vấn đề là chúng ta chọn bên nào. Bởi vì ranh giới giữa hai điều này thực sự rất mong manh.”", 146000.0, "Trinh thám"));
        bookList.add(new BookDomain("Người Trong Lưới", "nguoitrongluoi", "Ở chung cư nọ, cứ chiều xuống là các cụ già lại ra ngồi bên cửa sổ ngắm nhìn phố xá. Chiều hôm ấy, đang ngắm phố xá như thường lệ, có hai cụ trông thấy một cô bé ở tòa nhà đối diện mở cửa sổ, leo lên bệ cửa rồi nhảy xuống. Một trong hai cụ sợ đến ngất xỉu, cụ còn lại hô hoán người nhà báo cảnh sát. Cả hai đều khai, lúc cô bé nhảy xuống không có bất cứ ai đứng sau lưng cả.\n" +
                "\n" +
                "Chung cư này cũng là nơi dân tình hay ném đồ đạc trên cao xuống, người ta phải lắp camera giám sát để bắt phạt, một trong các camera cũng trung thực ghi lại cảnh cô bé nhảy lầu.\n" +
                "\n" +
                "Còn rất nhiều nhân chứng vật chứng khác cho thấy đây là một vụ tự sát, nhưng chị cô bé không tin.\n" +
                "\n" +
                "Không chấp nhận kết quả điều tra chính thức, không muốn em gái phải chết mù mờ oan ức, cô đã bắt tay lùng tìm theo một hướng bất hợp pháp, để lần lượt lôi ra từng kẻ thủ ác đang thu lu sau màn hình.\n" +
                "\n" +
                "Đặt cuộc trả thù cá nhân vào bối cảnh Hồng Kông hiện đại, khi ai nấy vô hồn với xung quanh vì chỉ biết cắm mặt vào điện thoại, Người trong lưới là một sự thật nhức nhối về ranh giới mỏng manh giữa vô tâm và ác tâm.\n" +
                "\n" +
                "Người Trong Lưới\n" +
                "\n" +
                "Ở chung cư nọ, cứ chiều xuống là các cụ già lại ra ngồi bên cửa sổ ngắm nhìn phố xá. Chiều hôm ấy, đang ngắm phố xá như thường lệ, có hai cụ trông thấy một cô bé ở tòa nhà đối diện mở cửa sổ, leo lên bệ cửa rồi nhảy xuống. Một trong hai cụ sợ đến ngất xỉu, cụ còn lại hô hoán người nhà báo cảnh sát. Cả hai đều khai, lúc cô bé nhảy xuống không có bất cứ ai đứng sau lưng cả.\n" +
                "\n" +
                "Chung cư này cũng là nơi dân tình hay ném đồ đạc trên cao xuống, người ta phải lắp camera giám sát để bắt phạt, một trong các camera cũng trung thực ghi lại cảnh cô bé nhảy lầu.\n" +
                "\n" +
                "Còn rất nhiều nhân chứng vật chứng khác cho thấy đây là một vụ tự sát, nhưng chị cô bé không tin.\n" +
                "\n" +
                "Không chấp nhận kết quả điều tra chính thức, không muốn em gái phải chết mù mờ oan ức, cô đã bắt tay lùng tìm theo một hướng bất hợp pháp, để lần lượt lôi ra từng kẻ thủ ác đang thu lu sau màn hình.\n" +
                "\n" +
                "Đặt cuộc trả thù cá nhân vào bối cảnh Hồng Kông hiện đại, khi ai nấy vô hồn với xung quanh vì chỉ biết cắm mặt vào điện thoại, Người trong lưới là một sự thật nhức nhối về ranh giới mỏng manh giữa vô tâm và ác tâm.", 19000.0, "Trinh thám"));
      bookList.add(new BookDomain("Sự Im Lặng Của Bầy Cừu", "suimlang", "Những cuộc phỏng vấn ở xà lim với kẻ ăn thịt người ham thích trò đùa trí tuệ, những tiết lộ nửa chừng hắn chỉ dành cho kẻ nào thông minh, những cái nhìn xuyên thấu thân phận và suy tư của cô mà đôi khi cô muốn lảng tránh... Clarice Starling đã dấn thân vào cuộc điều tra án giết người lột da hàng loạt như thế, để rồi trong tiếng bức bối của chiếc đồng hồ đếm ngược về cái chết, cô phải vật lộn để chấm dứt tiếng kêu bao lâu nay vẫn đeo đẳng giấc mơ mình: tiếng kêu của bầy cừu sắp bị đem đi giết thịt.\n" +
                "\n" +
                "Sự im lặng của bầy cừu hội tụ đầy đủ những yếu tố làm nên một cuốn tiểu thuyết trinh thám kinh dị xuất sắc nhất: không một dấu vết lúng túng trong những chi tiết thuộc lĩnh vực chuyên môn, với các tình tiết giật gân, cái chết luôn lơ lửng, với cuộc so găng của những bộ óc lớn mà không có chỗ cho kẻ ngu ngốc để cuộc chơi trí tuệ trở nên dễ dàng. Bồi đắp vào cốt truyện lôi cuốn đó là cơ hội được trải nghiệm trong trí não của cả kẻ gây tội lẫn kẻ thi hành công lý, khi mỗi bên phải vật vã trong ngục tù của đau đớn để tìm kiếm, khẩn thiết và liên tục, một sự lắng dịu cho tâm hồn.", 86000.0, "Tiểu thuyết, Trinh thám"));
        bookList.add(new BookDomain("Tiệm Tạp Hóa Namiya", "dieukydieu", "Một đêm vội vã lẩn trốn sau phi vụ khoắng đồ nhà người, Atsuya, Shota và Kouhei đã rẽ vào lánh tạm trong một căn nhà hoang bên con dốc vắng người qua lại. Căn nhà có vẻ khi xưa là một tiệm tạp hóa với biển hiệu cũ kỹ bám đầy bồ hóng, khiến người ta khó lòng đọc được trên đó viết gì. Định bụng nghỉ tạm một đêm rồi sáng hôm sau chuồn sớm, cả ba không ngờ chờ đợi cả bọn sẽ là một đêm không ngủ, với bao điều kỳ bí bắt đầu từ một phong thư bất ngờ gửi đến…\n" +
                "\n" +
                "Tài kể chuyện hơn người đã giúp Keigo khéo léo thay đổi các mốc dấu thời gian và không gian, chắp nối những câu chuyện tưởng chừng hoàn toàn riêng rẽ thành một kết cấu chặt chẽ, gây bất ngờ từ đầu tới cuối.", 99000.0, "Tiểu thuyết, Viễn tưởng"));
        bookList.add(new BookDomain("Nam Thiên Kì Đàm", "namthien", "“Trời đất thiên địa sinh ra vạn vật trên đời. Lẫn giữa người phàm, đã có bậc thánh nhân, tiên Phật oai linh, thì cũng sẽ có những loài yêu ma quỷ quái dị thường. Khi thì là đại thụ thành tinh, khi lại là vong hồn oan khuất còn lưu luyến cõi trần, lúc lại từ loài súc sinh hóa thành. Từ thuở xa xưa, chúng đã luôn tồn tại bên cạnh chúng ta trong muôn hình vạn trạng. Nay lục tìm sách vở, hoặc nhớ lại lời cổ nhân mà kể ra đôi chuyện quỷ dị.”\n" +
                "\n" +
                "Khi khoa học chưa xuất hiện và vũ trụ còn là những điều bí ẩn, để lý giải các hiện tượng xung quanh mình, con người đã hình dung ra các hiện tượng siêu nhiên, những vị thần lớn lao với mong muốn được bảo vệ và che chở. Cũng từ đó thần thoại ra đời đánh dấu ý thức của con người về giống nòi. \n" +
                "\n" +
                "Để chia sẻ với những bạn đọc yêu thích thần thoại, Cuốn sách “Nam thiên Kỳ đàm” là tập hợp những câu chuyện linh dị do fanpage “Truyện thần thoại” sưu tầm và tổng hợp. Mỗi câu chuyện đều được lưu truyền trong dân gian qua thế hệ, gợi lên cho chúng ta sự nguyên vẹn, tươi trẻ của con người thuở ban đầu. Đi sâu vào những câu chuyện ấy chúng ta sẽ được sống lại không khí sinh động của một thời kỳ mà tài liệu chính sử không nói đến, mang đậm bản sắc và phong vị người Việt cổ. \n" +
                "\n" +
                "Những giai thoại linh dị trong “Nam thiên kỳ đàm” hầu hết đều nói về thần tiên ma quái như Ngư tinh, Mộc tinh, Chuột tinh, Chổi tinh,... đi cùng là các tập tục cúng lễ, trừ yêu và sự bảo hộ của các vị thần như Lạc Long Quân, Kinh Dương Vương, Sứ Thanh Giang,...sưu tầm trong dân gian hoặc tham khảo từ các tài liệu đã xuất bản như Lĩnh Nam Chích Quái, Nam Hải dị nhân, Thánh Tông di cảo, Truyền thuyết Việt Nam,... \n" +
                "\n" +
                "Mỗi câu chuyện đều được tác giả xử lý một cách khéo léo, gần gũi. Tuy nhiên vẫn đảm bảo những giai thoại, truyền thuyết dân gian giữ được nét đẹp riêng tư của chúng, song hành cùng với lịch sử, phản ánh một phần lịch sử tới bạn đọc\n" +
                "\n" +
                "Mong rằng, thông qua những câu chuyện linh dị, cuốn sách không chỉ thỏa mãn sự tò mò của bạn đọc mà phần nào giúp ta hiểu hơn về văn hóa nước Nam theo một cách đặc biệt.\n" +
                "“Trời đất thiên địa sinh ra vạn vật trên đời. Lẫn giữa người phàm, đã có bậc thánh nhân, tiên Phật oai linh, thì cũng sẽ có những loài yêu ma quỷ quái dị thường. Khi thì là đại thụ thành tinh, khi lại là vong hồn oan khuất còn lưu luyến cõi trần, lúc lại từ loài súc sinh hóa thành. Từ thuở xa xưa, chúng đã luôn tồn tại bên cạnh chúng ta trong muôn hình vạn trạng. Nay lục tìm sách vở, hoặc nhớ lại lời cổ nhân mà kể ra đôi chuyện quỷ dị.”\n" +
                "\n" +
                "Khi khoa học chưa xuất hiện và vũ trụ còn là những điều bí ẩn, để lý giải các hiện tượng xung quanh mình, con người đã hình dung ra các hiện tượng siêu nhiên, những vị thần lớn lao với mong muốn được bảo vệ và che chở. Cũng từ đó thần thoại ra đời đánh dấu ý thức của con người về giống nòi. \n" +
                "\n" +
                "Để chia sẻ với những bạn đọc yêu thích thần thoại, Cuốn sách “Nam thiên Kỳ đàm” là tập hợp những câu chuyện linh dị do fanpage “Truyện thần thoại” sưu tầm và tổng hợp. Mỗi câu chuyện đều được lưu truyền trong dân gian qua thế hệ, gợi lên cho chúng ta sự nguyên vẹn, tươi trẻ của con người thuở ban đầu. Đi sâu vào những câu chuyện ấy chúng ta sẽ được sống lại không khí sinh động của một thời kỳ mà tài liệu chính sử không nói đến, mang đậm bản sắc và phong vị người Việt cổ. \n" +
                "\n" +
                "Những giai thoại linh dị trong “Nam thiên kỳ đàm” hầu hết đều nói về thần tiên ma quái như Ngư tinh, Mộc tinh, Chuột tinh, Chổi tinh,... đi cùng là các tập tục cúng lễ, trừ yêu và sự bảo hộ của các vị thần như Lạc Long Quân, Kinh Dương Vương, Sứ Thanh Giang,...sưu tầm trong dân gian hoặc tham khảo từ các tài liệu đã xuất bản như Lĩnh Nam Chích Quái, Nam Hải dị nhân, Thánh Tông di cảo, Truyền thuyết Việt Nam,... \n" +
                "\n" +
                "Mỗi câu chuyện đều được tác giả xử lý một cách khéo léo, gần gũi. Tuy nhiên vẫn đảm bảo những giai thoại, truyền thuyết dân gian giữ được nét đẹp riêng tư của chúng, song hành cùng với lịch sử, phản ánh một phần lịch sử tới bạn đọc\n" +
                "\n" +
                "Mong rằng, thông qua những câu chuyện linh dị, cuốn sách không chỉ thỏa mãn sự tò mò của bạn đọc mà phần nào giúp ta hiểu hơn về văn hóa nước Nam theo một cách đặc biệt.", 99000.0, "Viễn tưởng, Kinh dị"));
        bookList.add(new BookDomain("4MK", "mk", "\"Nạn nhân đầu tiên, Calli Tremell... Hai ngày sau khi bị bắt cóc, gia đình Tremell nhận được tải con gái mình trong hòm thư. Hai ngày sau đó, họ nhận được đôi mắt của cô. Hai ngày tiếp theo, chiếc lưỡi của cô được chuyển đến. Thi thể của cô gái được tìm thấy tại công viên Bedford... Bàn tay cô nắm chặt một mẩu giấy nhỏ ghi KHÔNG LÀM ĐIỀU ÁC...\"", 138000.0, "Tiểu thuyết, Trinh thám, Viễn tưởng, Kinh dị"));

        ArrayList<BookDomain> bookListCate = new ArrayList<>();
        for(BookDomain book : bookList){
            if(book.getCategory().contains(category_name)) {
                bookListCate.add(book);
            }
        }

        adapter = new CategoryBookListAdapter(bookListCate);
        recyclerViewCategoryBookList.setAdapter(adapter);
    }
}