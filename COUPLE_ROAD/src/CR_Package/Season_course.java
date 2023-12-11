package CR_Package;

import javax.swing.*;
import java.awt.*;

public class Season_course 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("LOVE ROAD");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(null);
        frame.add(panel);
        First_frame(panel);

        frame.setVisible(true);
    }

    
    // 첫 화면
    private static void First_frame(JPanel panel) 
    {
        JLabel title = new JLabel("LOVE ROAD");
        title.setFont(new Font("Serif", Font.BOLD, 24));
        title.setBounds(220, 100, 150, 50);
        panel.add(title);

        JLabel message = new JLabel("어느 계절의 장소를 추천해드릴까요?");
        message.setFont(new Font("Serif", Font.PLAIN, 16));
        message.setHorizontalAlignment(JLabel.CENTER);
        message.setBounds(50, 200, 500, 100);
        panel.add(message);
        
        JLabel icon_credit = new JLabel("Icons by Icon8");
        icon_credit.setForeground(Color.GRAY);
        icon_credit.setFont(new Font("Nanum Gothic", Font.PLAIN, 10));
        icon_credit.setHorizontalAlignment(JLabel.CENTER);
        icon_credit.setBounds(250, 540, 100, 20);
        panel.add(icon_credit);

        ImageIcon spring_button = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring.png"));
        ImageIcon summer_button = new ImageIcon(Season_course.class.getResource("/CR_Package/img/summer.png"));
        ImageIcon autumn_button = new ImageIcon(Season_course.class.getResource("/CR_Package/img/autumn.png"));
        ImageIcon winter_button = new ImageIcon(Season_course.class.getResource("/CR_Package/img/winter.png"));

        JLabel springLabel = new JLabel(spring_button);
        JLabel summerLabel = new JLabel(summer_button);
        JLabel autumnLabel = new JLabel(autumn_button);
        JLabel winterLabel = new JLabel(winter_button);

        springLabel.setBounds(45, 400, 96, 96);
        summerLabel.setBounds(183, 400, 96, 96);
        autumnLabel.setBounds(321, 400, 96, 96);
        winterLabel.setBounds(459, 400, 96, 96);

        panel.add(springLabel);
        panel.add(summerLabel);
        panel.add(autumnLabel);
        panel.add(winterLabel);

        springLabel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
            	Second_frame("봄");
            }
        });

        summerLabel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
            	Second_frame("여름");
            }
        });

        autumnLabel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
            	Second_frame("가을");
            }
        });

        winterLabel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
            	Second_frame("겨울");
            }
        });
    }
    
    // 2번째 화면
    private static void Second_frame(String season) {
        // JFrame 객체 생성
        JFrame frame = new JFrame(season + " 장소 추천");
        frame.setSize(600, 600);

        // 레이아웃을 null로 설정하여 컴포넌트 위치를 수동으로 지정
        frame.setLayout(null);
        
        if (season.equals("봄")) 
        {
        	 ImageIcon season_icon = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring.png"));
        	 season_icon = new ImageIcon(season_icon.getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH));
        	 JLabel season_imageLabel = new JLabel(season_icon);
             season_imageLabel.setBounds(240, 30, 96, 96);
             Image season_image = season_icon.getImage().getScaledInstance(96, 96, Image.SCALE_SMOOTH);
             season_icon = new ImageIcon(season_image);
             frame.getLayeredPane().add(season_imageLabel, JLayeredPane.PALETTE_LAYER);
        }
        else if (season.equals("여름")) 
        {
        	 ImageIcon season_icon = new ImageIcon(Season_course.class.getResource("/CR_Package/img/summer.png"));
        	 season_icon = new ImageIcon(season_icon.getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH));
        	 JLabel season_imageLabel = new JLabel(season_icon);
        	 season_imageLabel.setBounds(240, 30, 96, 96);
             Image season_image = season_icon.getImage().getScaledInstance(96, 96, Image.SCALE_SMOOTH);
             season_icon = new ImageIcon(season_image);
             frame.getLayeredPane().add(season_imageLabel, JLayeredPane.PALETTE_LAYER);
        } 
        else if (season.equals("가을")) 
        {
        	 ImageIcon season_icon = new ImageIcon(Season_course.class.getResource("/CR_Package/img/autumn.png"));
        	 season_icon = new ImageIcon(season_icon.getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH));
        	 JLabel season_imageLabel = new JLabel(season_icon);
        	 season_imageLabel.setBounds(240, 30, 96, 96);
             Image season_image = season_icon.getImage().getScaledInstance(96, 96, Image.SCALE_SMOOTH);
             season_icon = new ImageIcon(season_image);
             frame.getLayeredPane().add(season_imageLabel, JLayeredPane.PALETTE_LAYER);
        } 
        else if (season.equals("겨울")) 
        {
        	 ImageIcon season_icon = new ImageIcon(Season_course.class.getResource("/CR_Package/img/winter.png"));
        	 season_icon = new ImageIcon(season_icon.getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH));
        	 JLabel season_imageLabel = new JLabel(season_icon);
        	 season_imageLabel.setBounds(240, 30, 96, 96);
             Image season_image = season_icon.getImage().getScaledInstance(96, 96, Image.SCALE_SMOOTH);
             season_icon = new ImageIcon(season_image);
             frame.getLayeredPane().add(season_imageLabel, JLayeredPane.PALETTE_LAYER);
        }
        
        
        JLabel icon_credit = new JLabel("Icons by Icon8");
        icon_credit.setForeground(Color.GRAY);
        icon_credit.setFont(new Font("Nanum Gothic", Font.PLAIN, 10));
        icon_credit.setHorizontalAlignment(JLabel.CENTER);
        icon_credit.setBounds(250, 540, 100, 20);
        frame.getLayeredPane().add(icon_credit, JLayeredPane.PALETTE_LAYER);
        
        

        // 메시지 JLabel 생성 및 설정
        JLabel message = new JLabel(season + "에 어울리는 장소를 목적에 맞게 추천 받아보세요.");
        message.setFont(new Font("Serif", Font.BOLD, 20));
        message.setForeground(Color.BLACK);
        Dimension size = message.getPreferredSize();
        int x = (frame.getWidth() - size.width) / 2;
        message.setBounds(x, 180, size.width, size.height);

        // 메시지 JLabel을 content pane에 추가하고 레이어 설정
        frame.getLayeredPane().add(message, JLayeredPane.PALETTE_LAYER);

        // 버튼 크기 설정
        Dimension buttonSize = new Dimension(80, 80); // 조절된 크기로 변경

        // 버튼 이미지 아이콘 생성
        ImageIcon mealIcon = new ImageIcon(Season_course.class.getResource("/CR_Package/img/eating.png"));
        ImageIcon cafeIcon = new ImageIcon(Season_course.class.getResource("/CR_Package/img/coffee.png"));
        ImageIcon tourIcon = new ImageIcon(Season_course.class.getResource("/CR_Package/img/travel.png"));

        // 이미지 아이콘 크기 조절
        mealIcon = new ImageIcon(mealIcon.getImage().getScaledInstance(buttonSize.width, buttonSize.height, Image.SCALE_SMOOTH));
        cafeIcon = new ImageIcon(cafeIcon.getImage().getScaledInstance(buttonSize.width, buttonSize.height, Image.SCALE_SMOOTH));
        tourIcon = new ImageIcon(tourIcon.getImage().getScaledInstance(buttonSize.width, buttonSize.height, Image.SCALE_SMOOTH));

        // 버튼 생성
        JLabel mealButton = new JLabel("식사");
        JLabel cafeButton = new JLabel("카페");
        JLabel tourButton = new JLabel("관광");

        // 이미지 아이콘을 버튼에 설정
        mealButton.setIcon(mealIcon);
        cafeButton.setIcon(cafeIcon);
        tourButton.setIcon(tourIcon);

        // 버튼 위치 지정
        mealButton.setBounds(80, 400, buttonSize.width, buttonSize.height);
        cafeButton.setBounds(250, 400, buttonSize.width, buttonSize.height);
        tourButton.setBounds(410, 400, buttonSize.width, buttonSize.height);

        // 각 버튼을 content pane에 추가하고 레이어 설정
        frame.getLayeredPane().add(mealButton, JLayeredPane.POPUP_LAYER);
        frame.getLayeredPane().add(cafeButton, JLayeredPane.POPUP_LAYER);
        frame.getLayeredPane().add(tourButton, JLayeredPane.POPUP_LAYER);

        // 각 버튼에 리스너 추가
        mealButton.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
            	Third_frame(season, "식사");
            }
        });

        cafeButton.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
            	Third_frame(season, "카페");
            }
        });

        tourButton.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
            	Third_frame(season, "관광");
            }
        });

        frame.setVisible(true);
    }

    

    
    // 마지막 화면
    private static void Third_frame(String season, String content) 
    {
        JFrame content_frame = new JFrame(season + " " + content);
        content_frame.setSize(600, 600);

        JPanel content_panel = new JPanel(null);

        // 장소 이미지와 설명
        ImageIcon image = null;
        String name = "";
        String text = "";

        // 모든 경우에 출력될 이미지와 설명
        
        // 봄
        if (season.equals("봄") && content.equals("식사")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_meal.jfif"));
            name = "단양 보리곳간";
            text = "직접 재배하는 산나물과 지역 농민들이 재배하는 \n 제철 재료로 만든 요리를 판매하는 식당";
            //https://map.naver.com/p/search/%EB%B3%B4%EB%A6%AC%EA%B3%B3%EA%B0%84/place/1561549247?placePath=?entry=pll&from=nx&fromNxList=true&c=15.00,0,0,0,dh
        } 
        else if (season.equals("봄") && content.equals("카페")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_cafe.jpg"));
            name = "보령 청보리 창고";
            text = "- 푸른 청보리 밭을 보며 봄의 청량함을 느낄 수 있다. \n - 드라마 '그해 우리는' 촬영지";
            //https://m.blog.naver.com/goeun061133/223177333187?isInf=true
        }
        else if (season.equals("봄") && content.equals("관광")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_tour.jpg"));
            name = "순천 선암사";
            text = "- 벚나무가 많고, 겹벚꽃을 볼 수 있다. \n - 산으로 둘러싸여 있어 자연을 즐기기 적합하다.";
            //http://travel.chosun.com/site/data/html_dir/2015/03/06/2015030602608.html
        }
        
        
        // 여름
        else if (season.equals("여름") && content.equals("식사")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/summer_meal.jfif"));
            name = "송도 통큰조개";
            text = "바다를 보며 조개 요리를 먹을 수 있는 식당";
            //https://blog.naver.com/sacato/223079668473
        } 
        else if (season.equals("여름") && content.equals("카페")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/summer_cafe.jpg"));
            name = "강릉 보사노바";
            text = "- 오션 뷰, 파도 소리와 커피를 즐길 수 있다.";
            //https://kr.trip.com/moments/detail/gangwon-do-1185-12725580/
        }
        else if (season.equals("여름") && content.equals("관광")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/summer_tour.png"));
            name = "춘천 해피초원목장";
            text = "- 여름의 초록빛 자연과 춘천호의 조화 \n - 다양한 동물 먹이주기 체험 가능";
            //https://www.ecolivestock.org/magazine_theium/?q=YToxOntzOjEyOiJrZXl3b3JkX3R5cGUiO3M6MzoiYWxsIjt9&bmode=view&idx=8659330&t=board
        }      
         
        
        // 가을
        else if (season.equals("가을") && content.equals("식사")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/autumn_meal.jpg"));
            name = "약수터 산장";
            text = "물든 단풍잎이 보이는 마운틴뷰에서 식사할 수 있는 오리고기 맛집";
        } 
        else if (season.equals("가을") && content.equals("카페")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/autumn_cafe.jpg"));
            name = "피드";
            text = "계곡 근처에 있어서 계곡과 단풍을 즐기기 좋은 까페";
        }
        else if (season.equals("가을") && content.equals("관광")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/autumn_tour.png"));
            name = "산굼부리";
            text = "억새로 뒤덮힌 길을 걸으며 가을의 정취를 느낄 수 있는 곳";
        }
        
        
        // 겨울
        else if (season.equals("겨울") && content.equals("식사")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/winter_meal."));
            name = "자매수산";
            text = "강남에 있는 접근성 좋은 5대 방어 맛집. 겨울 제철 음식을 즐길 수 있다.";
        } 
        else if (season.equals("겨울") && content.equals("카페")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/winter_cafe.png"));
            name = "아나파우오";
            text = "한적한 곳에 위치해있어 탁트인 자연뷰를 즐기며 음료를 마실 수 있는 까페.";
        }
        else if (season.equals("겨울") && content.equals("관광")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/winter_tour.png"));
            name = "무주 덕유산 리조트";
            text = "리조트를 타고 설천봉까지 오를 수 있으며 곤돌라를 타고 올라가 멋진 설경을 관람할 수 있는 곳.";
        }
        
        
        JLabel title_label = new JLabel(season + " " + content);
        title_label.setFont(new Font("Serif", Font.BOLD, 24));
        title_label.setHorizontalAlignment(SwingConstants.CENTER);
        title_label.setBounds(0, 20, 600, 30); 
        content_panel.add(title_label);
        
        Image og = image.getImage();
        Image standard_size_image = og.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        image = new ImageIcon(standard_size_image);

        JLabel image_label = new JLabel(image);
        image_label.setBounds(150, 70, 300, 300); 
        content_panel.add(image_label);

        JLabel name_label = new JLabel(name);
        name_label.setFont(new Font("Serif", Font.PLAIN, 18));
        name_label.setHorizontalAlignment(SwingConstants.CENTER);
        name_label.setBounds(0, 400, 600, 30); 
        content_panel.add(name_label);
        
        JLabel text_label = new JLabel("<html>" + text.replace("\n", "<br>") + "</html>");
        text_label.setFont(new Font("Serif", Font.PLAIN, 18));
        text_label.setHorizontalAlignment(SwingConstants.LEFT); 
        text_label.setBounds(110, 430, 500, 100); 
        content_panel.add(text_label);

        content_frame.add(content_panel);
        content_frame.setVisible(true);
    }
}
