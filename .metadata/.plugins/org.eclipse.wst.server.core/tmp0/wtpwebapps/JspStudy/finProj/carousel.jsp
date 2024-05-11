<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<style type="text/css">
.carousel img{
	filter : brightness(0.6);
}
</style>
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); %>
<div class="container" style="display: flex;justify-content: center;">
<div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel" style="width: 80%;">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="3" aria-label="Slide 4"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="4" aria-label="Slide 5"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="5" aria-label="Slide 6"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="./assets/img2.jpg" class="d-block w-100" alt="..."
      style="height:500px;">
      <div class="carousel-caption d-none d-md-block">
        <h5>필리핀 최고의 자연 명소 10곳</h5>
        <p class="text-truncate">필리핀 최고의 자연 명소를 설립자 클레멘트 담팔 2세가 엄선하여 10곳 선정했습니다. 필리핀의 자연 경관을 야심차게 홍보하며 여러분을 필리핀으로 초대합니다.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="./assets/img3.jpg" class="d-block w-100" alt="..."
      style="height:500px;">
      <div class="carousel-caption d-none d-md-block">
        <h5>렌터카 예약 시 알아두면 좋을 팁 10가지</h5>
        <p class="text-truncate">운전할 줄 안다면 렌터카를 빌려 여행을 떠나보자. 렌터카를 빌리면 나만의 속도로 여행을 즐길 수 있어 보다 효율적이면서 재미있는 여행이 가능해진다.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="./assets/img4.jpg" class="d-block w-100" alt="..."
      style="height:500px;">
      <div class="carousel-caption d-none d-md-block">
        <h5>현지인처럼, 한 달 살기 좋은 해외 여행지 8</h5>
        <p  class="text-truncate">딱 한 달만, 그곳에서 살아보면 어때요? 최근 떠오르고 있는 여행 트렌드, 해외에서 한 달 살기! 전 세계 여행지 중 한 달 살기 여행을 즐기기 좋은 여행지 8곳을 알아보자.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="./assets/img5.jpg" class="d-block w-100" alt="..."
      style="height:500px;">
      <div class="carousel-caption d-none d-md-block">
        <h5>5일 휴가로 떠나는 유럽 여행</h5>
        <p class="text-truncate">7박 9일 스위스&이탈리아 코스! 멋지게 낸 5일 휴가로 더욱 멋진 유럽을 만끽하고 오자. JSP TRIP가 7박 9일 스위스&이탈리아 여행 코스를 소개한다.</p>
      </div>
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div></div>
</body>
</html>