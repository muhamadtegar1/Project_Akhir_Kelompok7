package projek.akhir.klp7;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import projek.model.DataKota;

public class Scene3 {
    private Stage stage;
    private DataKota dataKota;

    public Scene3() {
    }

    public Scene3(Stage stage, DataKota dataKota) {
        this.stage = stage;
        this.dataKota = dataKota;
    }

    public void show() {
        // Scene 3 main variables
        //Right section
        //wisata
        String Scene3TripImageUrl1 = getClass().getResource(dataKota.getScene3TripImageUrl1()).toExternalForm();
        String Scene3TripImageUrl2 = getClass().getResource(dataKota.getScene3TripImageUrl2()).toExternalForm();
        String Scene3TripImageUrl3 = getClass().getResource(dataKota.getScene3TripImageUrl3()).toExternalForm();

        String Scene3TripName1 = "NUSA PENIDA,\nsoutheast coast of Bali";
        String Scene3TripName2 = "BATUR MOUNT,\ncentral-eastern of Bali";
        String Scene3TripName3 = "KUTA Beach,\nsouthern of Bal";
        //UMKM
        String Scene3UmkmImageUrl1 = "/image/image29.png";
        String Scene3UmkmImageUrl2 = "/image/image30.png";
        String Scene3UmkmImageUrl3 = "/image/image31.png";

        String Scene3UmkmName1 = "Tenun Bali Collection";
        String Scene3UmkmName2 = "Oleh Oleh Perak Bali";
        String Scene3UmkmName3 = "Leolle Official Shop";




        // header
        BorderPane root_1 = new BorderPane();
        root_1.setId("body");

        Button backButton = new Button("BACK");
        Button homeButton = new Button("HOME");
        backButton.setId("button");
        homeButton.setId("button");

        Image logo = new Image(getClass().getResourceAsStream("/image/image25.png"));
        ImageView logoImage = new ImageView(logo);
        logoImage.setId("logo");

        Region spacer1 = new Region();
        HBox.setHgrow(spacer1, Priority.ALWAYS);
        Region spacer2 = new Region();
        HBox.setHgrow(spacer2, Priority.ALWAYS);

        HBox header = new HBox();
        header.setPadding(new Insets(10));
        header.getChildren().addAll(homeButton, spacer1, backButton);
        header.setId("header");




        // Left section
        ListView<ItemData> listView = new ListView<>();
        listView.setId("listView");
        listView.getItems().addAll(getItemData());

        listView.setCellFactory(new Callback<ListView<ItemData>, ListCell<ItemData>>() {
            @Override
            public ListCell<ItemData> call(ListView<ItemData> listView) {
                return new ButtonListCell();
            }
        });

        Label leftTittle = new Label("< BUDAYA >");
        leftTittle.setAlignment(Pos.CENTER);
        leftTittle.setId("leftTittle");

        HBox leftTittleContainer = new HBox(leftTittle);
        leftTittleContainer.setAlignment(Pos.CENTER);
        leftTittleContainer.setId("leftTittleContainer");

        VBox leftContainer = new VBox(40);
        leftContainer.setPadding(new Insets(10));
        leftContainer.setId("leftContainer");
        leftContainer.getChildren().addAll(leftTittleContainer,listView);




        //right section;
        //Trip
        Button tripNameContainer1 = new Button(Scene3TripName1);
        tripNameContainer1.setPadding(new Insets(5));
        tripNameContainer1.setId("tripName");

        Button tripNameContainer2 = new Button(Scene3TripName2);
        tripNameContainer2.setPadding(new Insets(5));
        tripNameContainer2.setId("tripName");

        Button tripNameContainer3 = new Button(Scene3TripName3);
        tripNameContainer3.setPadding(new Insets(5));
        tripNameContainer3.setId("tripName");

        Label rightTittle1 = new Label("WISATA");
        rightTittle1.setId("rightTittle");
        
        BorderPane rightImage1 = new BorderPane();
        rightImage1.setBottom(tripNameContainer1);
        rightImage1.setId("rightImage");
        rightImage1.setStyle("-fx-background-image: url('" + Scene3TripImageUrl1 + "');");

        BorderPane rightImage2 = new BorderPane();
        rightImage2.setBottom(tripNameContainer2);
        rightImage2.setId("rightImage");
        rightImage2.setStyle("-fx-background-image: url('" + Scene3TripImageUrl2 + "');");

        BorderPane rightImage3 = new BorderPane();
        rightImage3.setBottom(tripNameContainer3);
        rightImage3.setId("rightImage");
        rightImage3.setStyle("-fx-background-image: url('" + Scene3TripImageUrl3 + "');");

        HBox innerRightContainer1 = new HBox(10);
        innerRightContainer1.setAlignment(Pos.CENTER);
        innerRightContainer1.getChildren().addAll(rightImage1,rightImage2,rightImage3);

        //UMKM
        Label rightTittle2 = new Label("UMKM");
        rightTittle2.setId("rightTittle");

        Image umkmImage1 = new Image(Scene3UmkmImageUrl1);
        Image umkmImage2 = new Image(Scene3UmkmImageUrl2);
        Image umkmImage3 = new Image(Scene3UmkmImageUrl3);

        ImageView umkmImg1 = new ImageView(umkmImage1);
        ImageView umkmImg2= new ImageView(umkmImage2);
        ImageView umkmImg3 = new ImageView(umkmImage3);
        

        Button umkmName1 = new Button(Scene3UmkmName1);
        umkmName1.setPadding(new Insets(10));
        umkmName1.setId("umkmName");
        Button umkmName2 = new Button(Scene3UmkmName2);
        umkmName2.setPadding(new Insets(10));
        umkmName2.setId("umkmName");
        Button umkmName3 = new Button(Scene3UmkmName3);
        umkmName3.setPadding(new Insets(10));
        umkmName3.setId("umkmName");


        VBox rightImage4 = new VBox(10);
        rightImage4.getChildren().addAll(umkmImg1,umkmName1);
        rightImage4.setId("umkm");

        VBox rightImage5 = new VBox(10);
        rightImage5.getChildren().addAll(umkmImg2,umkmName2);
        rightImage5.setId("umkm");

        VBox rightImage6 = new VBox(10);
        rightImage6.getChildren().addAll(umkmImg3,umkmName3);
        rightImage6.setId("umkm");


        HBox innerRightContainer2 = new HBox(10);
        innerRightContainer2.setAlignment(Pos.CENTER);
        innerRightContainer2.getChildren().addAll(rightImage4,rightImage5,rightImage6);

        VBox rightContainer1 = new VBox(40);
        rightContainer1.setId("rightContainer");
        rightContainer1.getChildren().addAll(rightTittle1,innerRightContainer1);
        
        VBox rightContainer2 = new VBox(35);
        rightContainer2.setId("rightContainer");
        rightContainer2.getChildren().addAll(rightTittle2,innerRightContainer2);
        
        VBox mainRightContainer = new VBox(20);
        mainRightContainer.getChildren().addAll(rightContainer1,rightContainer2);



        //button eventListener
        backButton.setOnAction(V -> {
            Scene2 scene2 = new Scene2(stage);
            scene2.show(); 
        });

        homeButton.setOnAction(V -> {
            Scene2 scene2 = new Scene2(stage);
            scene2.show(); 
        });



        //tripButton event lsitener
        tripNameContainer1.setOnAction(V -> {
            Scene4A scene4A = new Scene4A(stage,this);
            scene4A.show(); 
        });

        tripNameContainer2.setOnAction(V -> {
            Scene4A scene4A = new Scene4A(stage, this);
            scene4A.show(); 
        });

        tripNameContainer3.setOnAction(V -> {
            Scene4A scene4A = new Scene4A(stage,this);
            scene4A.show();  
        });

        
        //UMKM button eventlistener
        umkmName1.setOnAction(V -> {
            Scene4B scene4B = new Scene4B(stage,this);
            scene4B.show(); 
        });

        umkmName2.setOnAction(V -> {
            Scene4B scene4B = new Scene4B(stage,this);
            scene4B.show(); 
        });

        umkmName3.setOnAction(V -> {
            Scene4B scene4B = new Scene4B(stage,this);
            scene4B.show(); 
        });



        // Layout arrangement
        BorderPane mainContainer = new BorderPane();
        mainContainer.setPadding(new Insets(20));
        mainContainer.setLeft(leftContainer);
        mainContainer.setRight(mainRightContainer);
        root_1.setCenter(mainContainer);
        root_1.setTop(header);

        Scene scene = new Scene(root_1, 1300, 650);
        scene.getStylesheets().add(getClass().getResource("/styling/style3.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }




    //list item and additional class
    private List<ItemData> getItemData() {
        // main variables
        // images
        String Scene3HistoryImageUrl1 = "/image/image24.png";
        String Scene3HistoryImageUrl2 = "/image/image24.png";
        String Scene3HistoryImageUrl3 = "/image/image24.png";
        
        String Scene3TraditionImageUrl1 = "/image/image24.png";
        String Scene3TraditionImageUrl2 = "/image/image24.png";
        String Scene3TraditionImageUrl3 = "/image/image24.png";

        String Scene3FoodImageUrl1 = "/image/image24.png";
        String Scene3FoodImageUrl2 = "/image/image24.png";
        String Scene3FoodImageUrl3 = "/image/image24.png";

        // texts
        String Scene3HistoryText1 = "Text for item 1 in container 1.";
        String Scene3HistoryText2 = "Text for item 1 in container 2.";
        String Scene3HistoryText3 = "Text for item 1 in container 3.";
        
        String Scene3TraditionText1 = "Text for item 2 in container 1.";
        String Scene3TraditionText2 = "Text for item 2 in container 2.";
        String Scene3TraditionText3 = "Text for item 2 in container 3.";

        String Scene3FoodText1 = "Text for item 3 in container 1.";
        String Scene3FoodText2 = "Text for item 3 in container 2.";
        String Scene3FoodText3 = "Text for item 3 in container 3.";

        

        List<ItemData> items = new ArrayList<>();
        items.add(new ItemData("Sejarah dan Warisan", Scene3HistoryText1, Scene3HistoryImageUrl1, Scene3HistoryText2, Scene3HistoryImageUrl2, Scene3HistoryText3, Scene3HistoryImageUrl3));
        items.add(new ItemData("tradisi dan Upacara Adat", Scene3TraditionText1, Scene3TraditionImageUrl1, Scene3TraditionText2, Scene3TraditionImageUrl2, Scene3TraditionText3, Scene3TraditionImageUrl3));
        items.add(new ItemData("kuliner", Scene3FoodText1, Scene3FoodImageUrl1, Scene3FoodText2, Scene3FoodImageUrl2, Scene3FoodText3, Scene3FoodImageUrl3));
        return items;
    }

    static class ItemData {
        private final String title;
        private final String text1;
        private final String imageUrl1;
        private final String text2;
        private final String imageUrl2;
        private final String text3;
        private final String imageUrl3;

        public ItemData(String title, String text1, String imageUrl1, String text2, String imageUrl2, String text3, String imageUrl3) {
            this.title = title;
            this.text1 = text1;
            this.imageUrl1 = imageUrl1;
            this.text2 = text2;
            this.imageUrl2 = imageUrl2;
            this.text3 = text3;
            this.imageUrl3 = imageUrl3;
        }

        public String getTitle() {
            return title;
        }

        public String getText1() {
            return text1;
        }

        public String getImageUrl1() {
            return imageUrl1;
        }

        public String getText2() {
            return text2;
        }

        public String getImageUrl2() {
            return imageUrl2;
        }

        public String getText3() {
            return text3;
        }

        public String getImageUrl3() {
            return imageUrl3;
        }
    }

    static class ButtonListCell extends ListCell<ItemData> {
        private final VBox vbox;
        private final Button button;
        private final StackPane buttonPane;
        private final HBox innerContainer1;
        private final HBox innerContainer2;
        private final HBox innerContainer3;
        private boolean isExpanded;

        public ButtonListCell() {
            vbox = new VBox();
            button = new Button();
            button.setId("listViewButton");
            buttonPane = new StackPane();
            buttonPane.setId("buttonContainer");
            innerContainer1 = new HBox(10);
            innerContainer2 = new HBox(10);
            innerContainer3 = new HBox(10);

            button.setOnAction(e -> toggleDetails());

            buttonPane.getChildren().add(button);
            vbox.getChildren().add(buttonPane);
            setGraphic(vbox);
        }

        @Override
        protected void updateItem(ItemData item, boolean empty) {
            super.updateItem(item, empty);

            if (empty || item == null) {
                setText(null);
                setGraphic(null);
            } else {
                button.setText(item.getTitle());

                innerContainer1.getChildren().clear();
                innerContainer2.getChildren().clear();
                innerContainer3.getChildren().clear();

                Label containerText1 = new Label(item.getText1());
                ImageView containerImage1 = new ImageView(new Image(getClass().getResourceAsStream(item.getImageUrl1())));
                innerContainer1.getChildren().addAll(containerImage1, containerText1);

                Label containerText2 = new Label(item.getText2());
                ImageView containerImage2 = new ImageView(new Image(getClass().getResourceAsStream(item.getImageUrl2())));
                innerContainer2.getChildren().addAll(containerText2, containerImage2);

                Label containerText3 = new Label(item.getText3());
                ImageView containerImage3 = new ImageView(new Image(getClass().getResourceAsStream(item.getImageUrl3())));
                innerContainer3.getChildren().addAll(containerImage3, containerText3);

                if (isExpanded) {
                    if (!vbox.getChildren().contains(innerContainer1)) {
                        vbox.getChildren().add(innerContainer1);
                    }
                    if (!vbox.getChildren().contains(innerContainer2)) {
                        vbox.getChildren().add(innerContainer2);
                    }
                    if (!vbox.getChildren().contains(innerContainer3)) {
                        vbox.getChildren().add(innerContainer3);
                    }
                }
                setGraphic(vbox);
            }
        }

        private void toggleDetails() {
            isExpanded = !isExpanded;
            if (isExpanded) {
                vbox.getChildren().addAll(innerContainer1, innerContainer2, innerContainer3);
            } else {
                vbox.getChildren().removeAll(innerContainer1, innerContainer2, innerContainer3);
            }
        }
    }
}