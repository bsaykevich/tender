package com.apiParser.pDeserialize;

import com.apiParser.pDeserializers.*;
import com.apiParser.pModel.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class PDeserialize {

    public static void main(String[] args) {

        String FILENAME = "_JSON_raw.txt";
        String jsonText = getJsonFromTextFile(FILENAME);
        //System.out.println(jsonText);

        /*//FILENAME = "test1.txt"
        Gson gson = new Gson();
        UpperClass upperClass = gson.fromJson(jsonText, UpperClass.class);
        System.out.println(upperClass);*/

        /*Gson gson = new Gson();
        UpperClass upperClass = gson.fromJson(jsonText, UpperClass.class);
        System.out.println(upperClass);*/



        Gson gson;

        gson = new GsonBuilder()
                .registerTypeAdapter(Address.class, new AddressDeserializer())
                .registerTypeAdapter(AuctionPeriod.class, new AuctionPeriodDeserializer())
                .registerTypeAdapter(Author.class, new AuthorDeserializer())
                .registerTypeAdapter(Award.class, new AwardDeserializer())
                .registerTypeAdapter(AwardPeriod.class, new AwardPeriodDeserializer())
                .registerTypeAdapter(Bid.class, new BidDeserializer())
                .registerTypeAdapter(Classification.class, new ClassificationDeserializer())
                .registerTypeAdapter(ComplaintPeriod.class, new ComplaintPeriodDeserializer())
                .registerTypeAdapter(ContactPoint.class, new ContactPointDeserializer())
                .registerTypeAdapter(Contract.class, new ContractDeserializer())
                .registerTypeAdapter(Data.class, new DataDeserializer())
                .registerTypeAdapter(DeliveryAddress.class, new DeliveryAddressDeserializer())
                .registerTypeAdapter(DeliveryDate.class, new DeliveryDateDeserializer())
                .registerTypeAdapter(Document.class, new DocumentDeserializer())
                .registerTypeAdapter(EnquiryPeriod.class, new EnquiryPeriodDeserializer())
                .registerTypeAdapter(Guarantee.class, new GuaranteeDeserializer())
                .registerTypeAdapter(Identifier.class, new IdentifierDeserializer())
                .registerTypeAdapter(Item.class, new ItemDeserializer())
                .registerTypeAdapter(MinimalStep.class, new MinimalStepDeserializer())
                .registerTypeAdapter(Period.class, new PeriodDeserializer())
                .registerTypeAdapter(ProcuringEntity.class, new ProcuringEntityDeserializer())
                .registerTypeAdapter(Question.class, new QuestionDeserializer())
                .registerTypeAdapter(Supplier.class, new SupplierDeserializer())
                .registerTypeAdapter(Tenderer.class, new TendererDeserializer())
                .registerTypeAdapter(TenderPeriod.class, new TenderPeriodDeserializer())
                .registerTypeAdapter(Unit.class, new UnitDeserializer())
                .registerTypeAdapter(UpperClass.class, new UpperClassDeserializer())
                .registerTypeAdapter(Value.class, new ValueDeserializer())
                .create();

        UpperClass upperClass = gson.fromJson(jsonText, UpperClass.class);

        System.out.println(upperClass);

    }



    // получаем пример json-а с текстового файла (из папки resources)
    private static String getJsonFromTextFile(String filename) {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        StringBuilder jsonTextBuilder = new StringBuilder();
        int ch;

        try (Reader reader = new InputStreamReader(
                classLoader.getResourceAsStream(filename), "UTF-8")
        ){
            while ((ch = reader.read()) != -1) {
                jsonTextBuilder.append((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonTextBuilder.toString().trim();
    }

}
