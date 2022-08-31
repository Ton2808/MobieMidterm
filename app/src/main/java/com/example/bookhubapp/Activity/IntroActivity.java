package com.example.bookhubapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.bookhubapp.Adapter.CategoryAdapter;
import com.example.bookhubapp.Adapter.PopularAdapter;
import com.example.bookhubapp.Domain.CategoryDomain;
import com.example.bookhubapp.Domain.BookDomain;
import com.example.bookhubapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class IntroActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter, adapter2, adapter3;
    private RecyclerView recyclerViewCategoryList, recyclerViewPopularList, recyclerViewNewestList;
    private ImageView map;
    private FloatingActionButton cart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        map = findViewById(R.id.imagemap);
        cart = findViewById(R.id.cart);

        recyclerViewCategory();
        recyclerViewPopular();
        recyclerNewestPopular();

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext() , CartListActivity.class));
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext() , MapActivity.class));
            }
        });
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList = findViewById(R.id.CardList);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category = new ArrayList<>();
        category.add(new CategoryDomain("Tiểu thuyết", "novel"));
        category.add(new CategoryDomain("Ngôn tình", "hearts"));
        category.add(new CategoryDomain("Trinh thám", "clue"));
        category.add(new CategoryDomain("Kinh dị", "zombie"));
        category.add(new CategoryDomain("Viễn tưởng", "science_fiction"));
        category.add(new CategoryDomain("Lịch sử", "coliseum"));

        adapter = new CategoryAdapter(category);
        recyclerViewCategoryList.setAdapter(adapter);
    }

    private void recyclerViewPopular(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewPopularList = findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<BookDomain> bookList = new ArrayList<>();
        bookList.add(new BookDomain("Cuộc phiêu lưu", "adventures_finn", "Sau những cuộc phiêu lưu cùng Tom Sawyer, Huck Finn được bà quả phụ Douglas đón về nuôi. Nhưng với bản tính ưa tự do, Huck không chịu nổi việc phải ăn vận sạch sẽ, học hành theo khuôn phép trưởng giả dù được sống giàu sang. Cộng thêm với việc người cha tưởng đã chết  đột ngột trở về tiếp tục hành hạ, gây rắc rối cho cậu, Huck quyết định cùng Jim – một nô lệ da đen bỏ trốn – cùng xuôi dòng Mississippi, bắt đầu những cuộc phiêu lưu mới.\n" +
                "\n" +
                "Nhiều chuyện dở khóc dở cười đã xảy ra trong chuyến phiêu lưu. Không chỉ thế, Huck còn lâm vào những tình huống nguy hiểm khi bị cuốn vào cuộc tranh chấp giữa hai dòng họ với những cuộc đọ súng chết chóc... Nhưng cũng chính trong hoàn cảnh ngặt nghèo nhất, Huck đã nhận ra giá trị của cuộc sống để hướng về sự tự do và hết lòng giúp đỡ người nô lệ da đen tội nghiệp. Từ một cậu bé chỉ biết phá phách, Huck đã xác định rõ ràng mục đích sống, biết phân biệt đúng sai bằng trái tim thuần hậu và thoát khỏi những định kiến méo mó được nhồi nhét qua cách giáo dục sai trái.", 85000.0));
        bookList.add(new BookDomain("Anna Karenina", "anna_kare", "Anna Karenina được xem như là một đỉnh cao của tiểu thuyết hiện thực. Nhân vật chính trong truyện Anna Karenina được Tolstoy sáng tác dựa vào Maria Aleksandrovna Hartung, người con gái lớn của đại thi hào Aleksandr Sergeyevich Pushkin. Sau khi gặp cô ở một bữa ăn tối, ông bắt đầu đọc truyện viết dở dang của Puskin: Những người khách họp mặt trong biệt thự, Tolstoy nảy ra ý định viết Anna Karenina.\n" +
                "\n" +
                "Theo một cuộc thăm dò gần đây, dựa trên ý kiến của 125 nhà văn nổi tiếng đương thời, tiểu thuyết Anna Karenina là tác phẩm có số phiếu bầu cao nhất trong danh sách 10 tác phẩm vĩ đại nhất mọi thời đại.", 132000.0));
        bookList.add(new BookDomain("Đại Gia Gatsby", "great_gatsby", "\"Gatsby đã tin vào đốm sáng xanh ấy, vào cái tương lai mê đắm đến cực điểm đang rời xa trước mắt chúng ta năm này qua năm khác. Ừ thì nó đã tuột khỏi tay chúng ta, nhưng có làm sao đâu – ngày mai chúng ta sẽ lại chạy nhanh hơn, vươn tay ra xa hơn…”\n" +
                "\n" +
                "Là bức chân dung của “Thời đại Jazz” (Jazz Age, cái tên do chính Fitzgerald đặt cho thời kỳ 1918 - 1929), đại gia Gatsby nắm bắt vô cùng sâu sắc tinh thần của thế hệ cùng thời ông: những ám ảnh thường trực về thành đạt, tiền bạc, sang trọng, dư dật, hào nhoáng; song đồng thời là nỗi âu lo trước thói sùng bái vật chất vô độ và sự thiếu vắng đạo đức đang ngày một lên ngôi. Phất lên nhanh chóng từ chỗ “hàn vi”, Gatsby, nhân vật chính của câu chuyện, những tưởng sẽ có tất cả - tiền bạc, quyền lực, và sau rốt là tình yêu -, nhưng rồi ảo tưởng tình yêu đó tan vỡ thật đau đớn, theo sau là cái chết tức tưởi của Gatsby, để cuối cùng lập tức bị người đời quên lãng. Là lời cảnh tỉnh để đời của Scott Fitzgerald về cái gọi là “Giấc mơ Mỹ”, Đại gia Gatsby được ví như một tượng đài văn học, một cánh cửa cần mở ra cho những ai quan tâm tới văn học và lịch sử tinh thần nước Mỹ thời hiện đai.\n" +
                "\n" +
                "Đại gia Gatsby (The Great Gatsby) từ lâu đã được đưa vào giảng dạy trong trường phổ thông và đại học ở nhiều nước trên thế giới. Cuốn tiểu thuyết “khác thường, tuyệt đẹp, cấu trúc phức tạp song trên hết là giản dị” (như lời chính nhà văn) đứng thứ hai trong danh sách 100 tiểu thuyết hay nhất thế kỷ 20 của Modern Library, và nằm trong danh sách 100 tiểu thuyết hay nhất bằng tiếng Anh từ 1923 đến 2005 do tạp chí Time bình chọn.", 68000.0));
        bookList.add(new BookDomain("Kiêu Hãnh Và Định Kiến", "kieuhanh_dinhkien", "Khắp làng trên xóm dưới Herfordshire xôn xao: Netherfield sắp có người thuê, mà còn là một quý ông chưa vợ với khoản lợi tức lên đến năm nghìn bảng mỗi năm. Chao ôi, quả là tin đáng mừng đối với gia đình ông bà Bennett, vốn có tới năm cô con gái cần phải gả chồng. Giữa những quay cuồng vũ hội cùng âm mưu toan tính của cả một xã hội ganh đua nhau tìm tấm chồng tốt cho các cô gái, nổi lên câu chuyện tình của cô con gái thứ cứng đầu Elizabeth và chàng quý tộc Darcy - nơi lòng Kiêu hãnh phải nhún nhường và Định kiến cần giải tỏa để có thể đi đến kết cục hoàn toàn viên mãn.\n" +
                "Suốt hơn 200 năm qua, Kiêu hãnh và Định kiến luôn nằm trong số những tiểu thuyết tiếng Anh được yêu mến nhất. Chính Jane Austen cũng coi tác phẩm xuất sắc này là “đứa con cưng” của bà. Tài năng của Austen quả thực đã biến câu chuyện tình sôi nổi nơi miền quê nước Anh thành một bản châm biếm sắc sảo hóm hỉnh và một viên ngọc quý trong kho tàng Anh ngữ.", 98000.0));
        bookList.add(new BookDomain("Cây Cam Ngọt Của Tôi", "caycamngot", "Hãy làm quen với Zezé, cậu bé tinh nghịch siêu hạng đồng thời cũng đáng yêu bậc nhất, với ước mơ lớn lên trở thành nhà thơ cổ thắt nơ bướm. Chẳng phải ai cũng công nhận khoản “đáng yêu” kia đâu nhé. Bởi vì, ở cái xóm ngoại ô nghèo ấy, nỗi khắc khổ bủa vây đã che mờ mắt người ta trước trái tim thiện lương cùng trí tưởng tượng tuyệt vời của cậu bé con năm tuổi.\n" +
                "\n" +
                "Có hề gì đâu bao nhiêu là hắt hủi, đánh mắng, vì Zezé đã có một người bạn đặc biệt để trút nỗi lòng: cây cam ngọt nơi vườn sau. Và cả một người bạn nữa, bằng xương bằng thịt, một ngày kia xuất hiện, cho cậu bé nhạy cảm khôn sớm biết thế nào là trìu mến, thế nào là nỗi đau, và mãi mãi thay đổi cuộc đời cậu.\n" +
                "Mở đầu bằng những thanh âm trong sáng và kết thúc lắng lại trong những nốt trầm hoài niệm, Cây cam ngọt của tôi khiến ta nhận ra vẻ đẹp thực sự của cuộc sống đến từ những điều giản dị như bông hoa trắng của cái cây sau nhà, và rằng cuộc đời thật khốn khổ nếu thiếu đi lòng yêu thương và niềm trắc ẩn. Cuốn sách kinh điển này bởi thế không ngừng khiến trái tim người đọc khắp thế giới thổn thức, kể từ khi ra mắt lần đầu năm 1968 tại Brazil.", 70000.0));
        bookList.add(new BookDomain("Người Đua Diều", "nguoiduadieu", "Câu chuyện là lời tự thuật của nhà văn người Mỹ gốc Afghanistan Amir về những năm tháng tuổi thơ đầy niềm vui cũng như lỗi lầm, về những ngày trôi dạt trên đất khách rồi cuộc hành trình trở lại quê hương đổ nát để cứu chuộc tội lỗi cho bản thân và cho cả người cha đã khuất. Theo dòng hồi ức của Amir, người đọc trở lại hơn hai mươi năm về trước, khi Amir còn là một cậu bé mười hai tuổi sống trong vòng tay che chở của Baba giàu sang và thanh thế. Cùng gắn bó với Amir suốt những năm tháng tuổi thơ là Hassan, con trai của người quản gia Ali, một cậu bé lanh lợi, mạnh mẽ nhiều lần xả thân để bảo vệ Amir. Thế nhưng tình bạn và lòng tận tụy của Hassan đã không được đền đáp, một ngày mùa đông năm 1975, Hassan vì ra sức bảo vệ chiếc diều xanh chiến lợi phẩm của Amir đã bị bọn trẻ xấu hành hung và nhục mạ. Sự nhu nhược và hèn nhát đã cản bước Amir cứu bạn, thậm chí, còn biến cậu thành một kẻ gian dối khi bịa chuyện nhằm đuổi cha con Ali và Hassan ra khỏi nhà. Và Amir đã phải trả giá cho lỗi lầm ấy trong suốt phần đời còn lại. Ngay cả khi anh đang sống sung túc trên đất Mỹ, ngay cả khi tìm được một mái ấm cho riêng mình hay thực hiện được mơ ước trở thành nhà văn, nỗi ám ảnh của một kẻ gian dối vẫn ngày đêm đeo đuổi Amir. Và cuối cùng, trở lại Afghanistan để cứu con trai Hassan khỏi tay bọn Taliban là con đường duy nhất để Amir chuộc lỗi với người bạn, người em cùng cha khác mẹ Hassan đã chết dưới họng súng Taliban.\n" +
                "\n" +
                "Người đua diều có đầy đủ các yếu tố cần thiết để trở thành một tác phẩm best-seller: tính thời sự, cốt truyện ly kỳ, xúc động, xung đột gay gắt giữa các tuyến nhân vật, trong chính bản thân nhân vật… Và sự thật, tác phẩm đã nắm giữ vị trí đầu bảng của The New York Times trong 110 tuần. Ngoài những khía cạnh trên, sức hấp dẫn của Người đua diều còn bắt nguồn từ giá trị nhận thức sâu sắc.", 150000.0));
        bookList.add(new BookDomain("Rừng Nauy", "rungnauy", "Câu chuyện bắt đầu từ một chuyến bay trong ngày mưa ảm đạm, một người đàn ông 37 tuổi chợt nghe thấy bài hát gắn liền với hình ảnh người yêu cũ, thế là quá khứ ùa về xâm chiếm thực tại. Mười tám năm trước, người đàn ông ấy là chàng Toru Wanatabe trẻ trung, mỗi chủ nhật lại cùng nàng Naoko lang thang vô định trên những con phố Tokyo. Họ sánh bước bên nhau để thấy mình còn sống, còn tồn tại, và gắng gượng tiếp tục sống, tiếp tục tồn tại sau cái chết của người bạn cũ Kizuki. Cho đến khi Toru nhận ra rằng mình thực sự yêu và cần có Naoko thì cũng là lúc nàng không thể chạy trốn những ám ảnh quá khứ, không thể hòa nhập với cuộc sống thực tại và trở về dưỡng bệnh trong một khu trị liệu khép kín. Toru, bên cạnh giảng đường vô nghĩa chán ngắt, bên cạnh những đêm chơi bời chuyển từ cảm giác thích thú đến uể oải, ghê tởẫn kiên nhẫn chờ đợi và hy vọng vào sự hồi phục của Naoko. Cuối cùng, những lá thư, những lần thăm hỏi, hồi ức về lần ân ái duy nhất của Toru không thể níu Naoko ở lại, nàng chọn cái chết như một lối đi thanh thản. Từ trong mất mát, Toru nhận ra rằng mình cần tiếp tục sống và bắt đầu tình yêu mới với Midori.\n" +
                "\n" +
                "Một cuốn sách ẩn chứa mọi điều khiến bạn phải say mê và đau đớn, tình yêu với muôn vàn màu sắc và cung bậc khác nhau, cảm giác trống rỗng và hẫng hụt của cả một thế hệ thanh niên vô hướng, ý niệm về sự sinh tồn tất yếu của cái chết trong lòng cuộc sống, những gắng gượng âm thầm nhưng quyết liệt của con người để vượt qua mất mát trong đờất cả đã tạo nên vẻ đẹp riêng cho \"Rừng Na uy\", im lặng, ma thuật và tuyệt vọng như một chấm máu cô độc giữa bạt ngàn tuyết lạnh.", 90000.0));
        bookList.add(new BookDomain("Kafka bên bờ biển", "kafkabobien", "Kafka Tamura, mười lăm tuổi, bỏ trốn khỏi nhà ở Tokyo để thoát khỏi lời nguyền khủng khiếp mà người cha đã giáng xuống đầu mình.Ở phía bên kia quần đảo, Nakata, một ông già lẩm cẩm cùng quyết định dấn thân. Hai số phận đan xen vào nhau để trở thành một tấm gương phản chiếu lẫn nhau. Trong khi đó, trên đường đi, thực tại xào xạc lời thì thầm quyến rũ. Khu rừng đầy những người linh vừa thoát khỏi cuộc chiến tranh vừa qua, cá mưa từ trên trời xuống và gái điếm trích dẫn Hegel. Kafka bên bờ biển, câu chuyện hoang đường mở đầu thế kỷ XXI, cho chúng ta đắm chìm trong một chuyến du hành đầy sóng gió đầy chất hiện đại và mơ mộng trong lòng Nhật Bản đương đại.\n" +
                "\n" +
                "Haruki Murakami, nhà văn Nhật đương đại nổi tiếng với những tác phẩm như Rừng Nauy; Xứ sở kỳ diệu vô tình và Nơi tận cùng thế giới; Phía Nam biên giới, Phía Tây mặt trời; Người tình Sputnik, Biên niên ký chim vặn dây cót và Kafka bên bờ biển.", 118800.0));

        adapter2 = new PopularAdapter(bookList);
        recyclerViewPopularList.setAdapter(adapter2);
    }

    private void recyclerNewestPopular(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewNewestList = findViewById(R.id.recyclerView3);
        recyclerViewNewestList.setLayoutManager(linearLayoutManager);

        ArrayList<BookDomain> bookList = new ArrayList<>();
        bookList.add(new BookDomain("Nhà Giả Kim", "nhagiakim", "Tất cả những trải nghiệm trong chuyến phiêu du theo đuổi vận mệnh của mình đã giúp Santiago thấu hiểu được ý nghĩa sâu xa nhất của hạnh phúc, hòa hợp với vũ trụ và con người.\n" +
                "\n" +
                "Tiểu thuyết Nhà giả kim của Paulo Coelho như một câu chuyện cổ tích giản dị, nhân ái, giàu chất thơ, thấm đẫm những minh triết huyền bí của phương Đông. Trong lần xuất bản đầu tiên tại Brazil vào năm 1988, sách chỉ bán được 900 bản. Nhưng, với số phận đặc biệt của cuốn sách dành cho toàn nhân loại, vượt ra ngoài biên giới quốc gia, Nhà giả kim đã làm rung động hàng triệu tâm hồn, trở thành một trong những cuốn sách bán chạy nhất mọi thời đại, và có thể làm thay đổi cuộc đời người đọc.\n" +
                "\n" +
                "“Nhưng nhà luyện kim đan không quan tâm mấy đến những điều ấy. Ông đã từng thấy nhiều người đến rồi đi, trong khi ốc đảo và sa mạc vẫn là ốc đảo và sa mạc. Ông đã thấy vua chúa và kẻ ăn xin đi qua biển cát này, cái biển cát thường xuyên thay hình đổi dạng vì gió thổi nhưng vẫn mãi mãi là biển cát mà ông đã biết từ thuở nhỏ. Tuy vậy, tự đáy lòng mình, ông không thể không cảm thấy vui trước hạnh phúc của mỗi người lữ khách, sau bao ngày chỉ có cát vàng với trời xanh nay được thấy chà là xanh tươi hiện ra trước mắt. ‘Có thể Thượng đế tạo ra sa mạc chỉ để cho con người biết quý trọng cây chà là,’ ông nghĩ.", 65000.0));
        bookList.add(new BookDomain("Dám Bị Ghét", "dambighet", "TẠI SAO BẠN CỨ PHẢI SỐNG THEO KHUÔN MẪU NGƯỜI KHÁC ĐẶT RA?\n" +
                "\n" +
                "Dưới hình thức một cuộc đối thoại giữa Chàng thanh niên và Triết gia, cuốn sách trình bày một cách sinh động và hấp dẫn những nét chính trong tư tưởng của nhà tâm lý học Alfred Adler, người được mệnh danh là một trong “ba người khổng lồ của tâm lý học hiện đại”, sánh ngang với Freud và Jung. Khác với Freud cho rằng quá khứ và hoàn cảnh là động lực làm nên con người ta của hiện tại, Adler chủ trương “cuộc đời ta là do ta lựa chọn”, và tâm lý học Adler được gọi là “tâm lý học của lòng can đảm”.\n" +
                "\n" +
                "Bạn bất hạnh không phải do quá khứ và hoàn cảnh, càng không phải do thiếu năng lực. Bạn chỉ thiếu “can đảm” mà thôi. Nói một cách khác, bạn không đủ “can đảm để dám hạnh phúc”. [] Bởi can đảm để dám hạnh phúc bao gồm cả “can đảm để dám bị ghét” nữa. [] Chỉ khi dám bị người khác ghét bỏ, chúng ta mới có được tự do, có được hạnh phúc.", 66000.0));
        bookList.add(new BookDomain("Suối Nguồn (Tái Bản)", "suoinguon", "\" Trong lịch sử nhân loại, hiếm thấy ai phát biểu quan điểm này về con người. Ngày nay, quan điểm này hầu như không tồn tại. Tuy nhiên, chính quan điểm này - dù tồn tại ở các cấp độ khác nhau của sự khao khát, ao ước, đam mê và hoang mang đau khổ - là quan điểm khởi đầu cuộc sống của những người ưu tú nhất của nhân loại. Đối với đa số họ, đây thậm chí không phải là một quan điểm rõ ràng mà chỉ là một cảm giác mơ hồ, khó nắm bắt, nó được tạo thành từ những nỗi đau trần trụi và từ niềm hạnh phúc không thể diễn tả nổi. Nó là cảm giác về một kỳ vọng lớn, rằng cuộc sống của một người là quan trọng, rằng những thành tựu lớn lao có thể nằm trong khả năng, và rằng những điều vĩ đại còn nằm phía trước.\n" +
                "\n" +
                "Bản chất của con người - và của bất cứ sinh vật nào - không phải là đầu hàng, hoặc phỉ nhổ và nguyền rủa sự tồn tại của mình; điều ấy thực ra đòi hỏi cả một quá trình suy đồi mà tốc độ của nó tuỳ thuộc mỗi người. Một vài người đầu hàng vào lần đầu tiên tiếp xúc với áp lực; một vài người mặc nhiên đầu hàng; một số khác đi xuống từ từ và cứ thế mất dần ngọn lửa mà chính họ cũng không hề nhận ra nó đã tàn lụi như thế nào. Sau đó, tất cả biến mất trong cái đầm lầy khổng lồ gồm những người già cỗi, những người rao giảng rằng trưởng thành bao hàm việc chối bỏ chính kiến, rằng sự ổn định bao hàm việc chối bỏ những giá trị riêng, và rằng sống thực tế có nghĩa là phải gạt bỏ sự tồn tại. Chỉ một số ít người kiên quyết không đầu hàng và tiếp tục tiến lên; họ biết rằng không thể phản bội ngọn lửa kia; họ học cách nuôi dưỡng nó, cho nó hình hài, mục đích và sự số Tóm lại, dù tương lai mỗi người khác nhau, ở vào thời điểm bắt đầu cuộc sống, nhân loại luôn tìm kiếm một hình ảnh cao cả về bản chất con người cũng như về cuộc sống.\n" +
                "\n" +
                "Có rất ít cột chỉ đường trong cuộc tìm kiếm này. Suối nguồn là một trong những cột chỉ đường đó. Đây chính là một trong những lý do cơ bản nhất khiến cho suối nguồn có sức hấp dẫn lâu dài; nó tái khẳng định tinh thần của tuổi trẻ, nó tuyên bố về chiến thắng của con người, nó chỉ ra người ta có thể làm được những gì\".", 291000.0));
        bookList.add(new BookDomain("Kiêu Hãnh Và Định Kiến", "kieuhanh_dinhkien", "Khắp làng trên xóm dưới Herfordshire xôn xao: Netherfield sắp có người thuê, mà còn là một quý ông chưa vợ với khoản lợi tức lên đến năm nghìn bảng mỗi năm. Chao ôi, quả là tin đáng mừng đối với gia đình ông bà Bennett, vốn có tới năm cô con gái cần phải gả chồng. Giữa những quay cuồng vũ hội cùng âm mưu toan tính của cả một xã hội ganh đua nhau tìm tấm chồng tốt cho các cô gái, nổi lên câu chuyện tình của cô con gái thứ cứng đầu Elizabeth và chàng quý tộc Darcy - nơi lòng Kiêu hãnh phải nhún nhường và Định kiến cần giải tỏa để có thể đi đến kết cục hoàn toàn viên mãn.\n" +
                "Suốt hơn 200 năm qua, Kiêu hãnh và Định kiến luôn nằm trong số những tiểu thuyết tiếng Anh được yêu mến nhất. Chính Jane Austen cũng coi tác phẩm xuất sắc này là “đứa con cưng” của bà. Tài năng của Austen quả thực đã biến câu chuyện tình sôi nổi nơi miền quê nước Anh thành một bản châm biếm sắc sảo hóm hỉnh và một viên ngọc quý trong kho tàng Anh ngữ.", 98000.0));
        bookList.add(new BookDomain("Cây Cam Ngọt Của Tôi", "caycamngot", "Hãy làm quen với Zezé, cậu bé tinh nghịch siêu hạng đồng thời cũng đáng yêu bậc nhất, với ước mơ lớn lên trở thành nhà thơ cổ thắt nơ bướm. Chẳng phải ai cũng công nhận khoản “đáng yêu” kia đâu nhé. Bởi vì, ở cái xóm ngoại ô nghèo ấy, nỗi khắc khổ bủa vây đã che mờ mắt người ta trước trái tim thiện lương cùng trí tưởng tượng tuyệt vời của cậu bé con năm tuổi.\n" +
                "\n" +
                "Có hề gì đâu bao nhiêu là hắt hủi, đánh mắng, vì Zezé đã có một người bạn đặc biệt để trút nỗi lòng: cây cam ngọt nơi vườn sau. Và cả một người bạn nữa, bằng xương bằng thịt, một ngày kia xuất hiện, cho cậu bé nhạy cảm khôn sớm biết thế nào là trìu mến, thế nào là nỗi đau, và mãi mãi thay đổi cuộc đời cậu.\n" +
                "Mở đầu bằng những thanh âm trong sáng và kết thúc lắng lại trong những nốt trầm hoài niệm, Cây cam ngọt của tôi khiến ta nhận ra vẻ đẹp thực sự của cuộc sống đến từ những điều giản dị như bông hoa trắng của cái cây sau nhà, và rằng cuộc đời thật khốn khổ nếu thiếu đi lòng yêu thương và niềm trắc ẩn. Cuốn sách kinh điển này bởi thế không ngừng khiến trái tim người đọc khắp thế giới thổn thức, kể từ khi ra mắt lần đầu năm 1968 tại Brazil.", 70000.0));
        bookList.add(new BookDomain("Người Đua Diều", "nguoiduadieu", "Câu chuyện là lời tự thuật của nhà văn người Mỹ gốc Afghanistan Amir về những năm tháng tuổi thơ đầy niềm vui cũng như lỗi lầm, về những ngày trôi dạt trên đất khách rồi cuộc hành trình trở lại quê hương đổ nát để cứu chuộc tội lỗi cho bản thân và cho cả người cha đã khuất. Theo dòng hồi ức của Amir, người đọc trở lại hơn hai mươi năm về trước, khi Amir còn là một cậu bé mười hai tuổi sống trong vòng tay che chở của Baba giàu sang và thanh thế. Cùng gắn bó với Amir suốt những năm tháng tuổi thơ là Hassan, con trai của người quản gia Ali, một cậu bé lanh lợi, mạnh mẽ nhiều lần xả thân để bảo vệ Amir. Thế nhưng tình bạn và lòng tận tụy của Hassan đã không được đền đáp, một ngày mùa đông năm 1975, Hassan vì ra sức bảo vệ chiếc diều xanh chiến lợi phẩm của Amir đã bị bọn trẻ xấu hành hung và nhục mạ. Sự nhu nhược và hèn nhát đã cản bước Amir cứu bạn, thậm chí, còn biến cậu thành một kẻ gian dối khi bịa chuyện nhằm đuổi cha con Ali và Hassan ra khỏi nhà. Và Amir đã phải trả giá cho lỗi lầm ấy trong suốt phần đời còn lại. Ngay cả khi anh đang sống sung túc trên đất Mỹ, ngay cả khi tìm được một mái ấm cho riêng mình hay thực hiện được mơ ước trở thành nhà văn, nỗi ám ảnh của một kẻ gian dối vẫn ngày đêm đeo đuổi Amir. Và cuối cùng, trở lại Afghanistan để cứu con trai Hassan khỏi tay bọn Taliban là con đường duy nhất để Amir chuộc lỗi với người bạn, người em cùng cha khác mẹ Hassan đã chết dưới họng súng Taliban.\n" +
                "\n" +
                "Người đua diều có đầy đủ các yếu tố cần thiết để trở thành một tác phẩm best-seller: tính thời sự, cốt truyện ly kỳ, xúc động, xung đột gay gắt giữa các tuyến nhân vật, trong chính bản thân nhân vật… Và sự thật, tác phẩm đã nắm giữ vị trí đầu bảng của The New York Times trong 110 tuần. Ngoài những khía cạnh trên, sức hấp dẫn của Người đua diều còn bắt nguồn từ giá trị nhận thức sâu sắc.", 150000.0));
        bookList.add(new BookDomain("Rừng Nauy", "rungnauy", "Câu chuyện bắt đầu từ một chuyến bay trong ngày mưa ảm đạm, một người đàn ông 37 tuổi chợt nghe thấy bài hát gắn liền với hình ảnh người yêu cũ, thế là quá khứ ùa về xâm chiếm thực tại. Mười tám năm trước, người đàn ông ấy là chàng Toru Wanatabe trẻ trung, mỗi chủ nhật lại cùng nàng Naoko lang thang vô định trên những con phố Tokyo. Họ sánh bước bên nhau để thấy mình còn sống, còn tồn tại, và gắng gượng tiếp tục sống, tiếp tục tồn tại sau cái chết của người bạn cũ Kizuki. Cho đến khi Toru nhận ra rằng mình thực sự yêu và cần có Naoko thì cũng là lúc nàng không thể chạy trốn những ám ảnh quá khứ, không thể hòa nhập với cuộc sống thực tại và trở về dưỡng bệnh trong một khu trị liệu khép kín. Toru, bên cạnh giảng đường vô nghĩa chán ngắt, bên cạnh những đêm chơi bời chuyển từ cảm giác thích thú đến uể oải, ghê tởẫn kiên nhẫn chờ đợi và hy vọng vào sự hồi phục của Naoko. Cuối cùng, những lá thư, những lần thăm hỏi, hồi ức về lần ân ái duy nhất của Toru không thể níu Naoko ở lại, nàng chọn cái chết như một lối đi thanh thản. Từ trong mất mát, Toru nhận ra rằng mình cần tiếp tục sống và bắt đầu tình yêu mới với Midori.\n" +
                "\n" +
                "Một cuốn sách ẩn chứa mọi điều khiến bạn phải say mê và đau đớn, tình yêu với muôn vàn màu sắc và cung bậc khác nhau, cảm giác trống rỗng và hẫng hụt của cả một thế hệ thanh niên vô hướng, ý niệm về sự sinh tồn tất yếu của cái chết trong lòng cuộc sống, những gắng gượng âm thầm nhưng quyết liệt của con người để vượt qua mất mát trong đờất cả đã tạo nên vẻ đẹp riêng cho \"Rừng Na uy\", im lặng, ma thuật và tuyệt vọng như một chấm máu cô độc giữa bạt ngàn tuyết lạnh.", 90000.0));
        bookList.add(new BookDomain("Kafka bên bờ biển", "kafkabobien", "Kafka Tamura, mười lăm tuổi, bỏ trốn khỏi nhà ở Tokyo để thoát khỏi lời nguyền khủng khiếp mà người cha đã giáng xuống đầu mình.Ở phía bên kia quần đảo, Nakata, một ông già lẩm cẩm cùng quyết định dấn thân. Hai số phận đan xen vào nhau để trở thành một tấm gương phản chiếu lẫn nhau. Trong khi đó, trên đường đi, thực tại xào xạc lời thì thầm quyến rũ. Khu rừng đầy những người linh vừa thoát khỏi cuộc chiến tranh vừa qua, cá mưa từ trên trời xuống và gái điếm trích dẫn Hegel. Kafka bên bờ biển, câu chuyện hoang đường mở đầu thế kỷ XXI, cho chúng ta đắm chìm trong một chuyến du hành đầy sóng gió đầy chất hiện đại và mơ mộng trong lòng Nhật Bản đương đại.\n" +
                "\n" +
                "Haruki Murakami, nhà văn Nhật đương đại nổi tiếng với những tác phẩm như Rừng Nauy; Xứ sở kỳ diệu vô tình và Nơi tận cùng thế giới; Phía Nam biên giới, Phía Tây mặt trời; Người tình Sputnik, Biên niên ký chim vặn dây cót và Kafka bên bờ biển.", 118800.0));

        adapter3 = new PopularAdapter(bookList);
        recyclerViewNewestList.setAdapter(adapter3);
    }
}