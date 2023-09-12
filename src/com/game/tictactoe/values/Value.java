package com.game.tictactoe.values;

import java.awt.Color;

public class Value {

    public static final String INFO_MESSAGE = "Trường: Đại Học Kiến Trúc Hà Nội\n"
            + "Môn: Trí Tuệ Nhân Tạo\n"
            + "Giảng viên: Bùi Hải Phong\n"
            + "Đề tài: Game Tic Tac Toe sử dụng thuật toán cắt tỉa alpha beta\n"
            + "Thành viên nhóm:\n"
            + " Nguyễn Huy Tuấn\n"
            + " Nguyễn Ngọc Tú\n"
            + " Phạm Thị Trang\n"
            + " Phạm Bá Vương\n"
            + " Nguyễn Mạnh Tường\n"
            + "Nội dung:\n"
            + " Game Tic Tac Toe sử dụng thuật toán cắt tỉa alpha beta, bài tập nhóm môn trí tuệ nhân tạo!";
    public static final String INTRODUCE_MESSAGE = "Luật Chơi Tic Tac Toe\n"
            + "\n"
            + " Ở Việt Nam, cờ này thường chơi trên giấy tập học sinh (đã có sẵn các ô ),"
            + " dùng bút đánh dấu hình tròn (O) và chữ thập (X) để đại diện cho 2 quân cờ,"
            + " bên nào có đường 5 quân liền nhau trên một hàng, một cột hoặc một đường chéo là thắng."
            + " Các luật cơ bản: Ván cờ được chơi trên bàn cờ .\n"
            + " \n "
            + " Hai bên sẽ thay phiên nhau đi những quân cờ vào giao điểm của các hàng ngang và cột dọc."
            + " Người đi trước (quân đen) sẽ đi quân đầu tiên vào tâm bàn cờ (giao của hàng 8, cột 8)."
            + " Luật thắng thì cũng như cờ ca-rô, tuy nhiên bên đen phải chịu những hạn chế cơ bản sau:"
            + " không được tạo thành một hàng 6 quân liên tiếp (overlines),"
            + " không được tạo thành các bẫy 3×3 (double-threes) và 4×4 (double-fours)"
            + " – nếu đi vào những nước như vậy coi như thua,"
            + " người nào đi được 5 quân nhưng đã bị chặn trước ở 2 đầu sẽ không thắng.\n"
            + "\n"
            + " Cuối cùng, có luật về nước đi thứ 5 và thứ 7:"
            + " Ở những nước thứ 5 và thứ 7, quân đen phải đưa ra 2 phương án nước đi"
            + " để quân trắng có quyền lựa chọn (Alternative moves 5th and 7th)."
            + " Hai lựa chọn này phải không đối xứng nhau (vì nếu đối xứng thì coi như không có quyền chọn)."
            + " Tất cả những luật này không những hạn chế ưu thế của quân đen"
            + " mà còn đem đến cho quân trắng những cơ hội phải công.\n"
            + "\n"
            + " Ví dụ, quân trắng, bằng những nước đi của mình có thể buộc quân đen"
            + " tạo thành 1 hàng 6 quân liên tiếp hay tạo thành bẫy 3×3."
            + " Có những ván đấu kết thúc ngay ở nước thứ 7 vì quân đen buộc phải đi 2 nước đối xứng.\n"
            + "\n"
            + " Tic Tac Toe tưởng như rất đơn giản nhưng lại là môn cờ rất phức tạp và rất hấp dẫn."
            + " Với một trò chơi sử dụng chủ yếu là kỹ năng logic thế này,"
            + " Tic Tac Toe rất phù hợp với lứa tuổi học sinh.\n"
            + "\n"
            + "Nguồn bài viết: cothu.vn";

    /**
     * số hàng/số cột mặc định
     */
    public static final int SIZE = 19;
    /**
     * chế độ chơi mặc định: User đi trước
     */
    public static final int DEFAULT_MODE = 0;
    /**
     * độ rộng của mỗi cell
     */
    public static final int CELL_WIDTH = 30;
    /**
     * khoảng cách giữa các panel
     */
    public static final int MARGIN = 10;
    /**
     * cỡ chữ trong mỗi cell
     */
    public static final int TEXT_CELL_SIZE = 20;
    /**
     * màu chữ mặc định của X
     */
    public static final Color USER_TEXT_COLOR = Color.magenta;
    /**
     * màu chữ mặc định của O
     */
    public static final Color AI_TEXT_COLOR = Color.GREEN;
    /**
     * màu mặc định của mỗi ô vuông
     */
    public static final Color CELL_COLOR = Color.white;

    /**
     * màu mặc định khi user click vào một ô trong bàn cờ
     */
    public static final Color CLICK_CELL_COLOR = new Color(0, 139, 139);
    /**
     * màu nền mặc định
     */
    public static final Color BACKGROUND_COLOR = new Color(31, 31, 51);
    /**
     * Giá trị mặc định của user
     */
    public static final int USER_VALUE = 1;
    /**
     * Giá trị mặc định của AI
     */
    public static final int AI_VALUE = 2;
    /**
     * Độ sâu tìm kiếm tối đa
     */
    public static final int MAX_DEPTH = 3;
    /**
     * số lượng lấy ra tối đa của danh sách các ô được lượng giá cao nhất
     */
    public static final int MAX_NUM_OF_HIGHEST_CELL_LIST = 8;
}
