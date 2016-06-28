public class Main {

    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost("http://你的服务地址+接口");

        post.addHeader(HTTP.CONTENT_TYPE, "application/json");
        JSONObject para = new JSONObject();
//        para.put("villageId","1");
//        para.put("productTypeId","2");
//        para.put("page","1");
//        para.put("cityId","1");
        StringEntity se = new StringEntity(para.toJSONString());
        se.setContentType("text/json");
        se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
        post.setEntity(se);

        HttpResponse response = httpClient.execute(post);
        HttpEntity entity = response.getEntity();
        String responseBody  = EntityUtils.toString(entity);
        System.out.println(responseBody);

    }
}
