

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	
</head>
<body>

 <div id="home-container" class="homecontent" style="background-image: url(//content.skyscnr.com/6bf5a29ce130132f28e912434f295b76/canada-lake-feb.jpg?crop=200px:45px&amp;quality=40)">
    <div class="wrap-homecontent">
      
      <div id="searchcontrol">
<script>
  (function() {
    $('#home-container').css("background-image", "url(//content.skyscnr.com/6bf5a29ce130132f28e912434f295b76/canada-lake-feb.jpg?crop=2000px:599px&quality=80)");
  })();
</script>

<section id="js-search-controls-container" class="search-controls one-line-search-controls opaque-on-desktop">
        <form action="#" class="clearfix">
                <section id="js-trip-type" class="search-controls-trip-type multi-city-enabled">
                    <div class="mobile-container">
                        <input type="radio" id="js-is-return-input" name="trip-type" value="return" class="visuallyhidden" tabindex="1" />
                        <label for="js-is-return-input" class="return-trip">왕복</label>
                        <input type="radio" id="js-one-way-input" name="trip-type" value="oneway" class="visuallyhidden" tabindex="1" />
                        <label for="js-one-way-input" class="one-way-trip">편도</label>
                        <input type="radio" id="js-multi-city-input" name="trip-type" value="multicity" class="visuallyhidden" tabindex="1" />
                        <label for="js-multi-city-input" class="multi-city-trip">다구간</label>
                    </div>
                </section>
            <section class="traditional-search clearfix">
                <div id="js-places" class="search-controls-places clearfix">
                    <div class="origin-place">
                        <label for="js-origin-input" class="place-label">출발지</label>
                        <input type="text" id="js-origin-input" tabindex="2" autocomplete="off" autocorrect="off" autocapitalize="off" spellcheck="false" dir="auto">
                        <label class="nearby-alts sc-checkbox">
                            <input type="checkbox" id="js-outbound-alts" class="visuallyhidden" />
                            주변 공항 추가
                        </label>
                    </div>
                    <button type="button" id="js-places-toggle" class="swap-button" title="여기를 클릭하여 장소 변경">
                        <span class="visuallyhidden">여기를 클릭하여 장소 변경</span>
                    </button>
                    <div class="destination-place">
                        <label for="js-destination-input" class="place-label">도착지</label>
                        <input type="text" id="js-destination-input" placeholder="국가, 도시 또는 공항 이름을 입력해 주십시오." tabindex="2" autocomplete="off" autocorrect="off" autocapitalize="off" spellcheck="false" dir="auto">
                        <label class="nearby-alts sc-checkbox">
                            <input type="checkbox" id="js-inbound-alts" class="visuallyhidden" />
                            주변 공항 추가
                        </label>
                    </div>
                </div><div id="js-dates" class="search-controls-dates">
                    <div class="depart">
                        <label for="js-depart-input">가는날</label>
                        <input type="text" id="js-depart-input" tabindex="3" autocomplete="off" autocorrect="off" autocapitalize="off" spellcheck="false" readonly="">
                    </div>
                    <div class="return ">
                        <label for="js-return-input">오는날</label>
                        <input type="text" id="js-return-input" tabindex="3" autocomplete="off" autocorrect="off" autocapitalize="off" spellcheck="false" readonly="">
                    </div>
                    <span id="js-depart-summary" class="date-summary"></span>
                    <span id="js-return-summary" class="date-summary"></span>
                </div><div id="js-pax-cabin-class" class="search-controls-pax-cabin-class">
                    <label for="js-trad-cabin-class-travellers-toggle">좌석 등급 및 승객</label>
                    <button type="button" id="js-trad-cabin-class-travellers-toggle" class="cabin-class-travellers-trigger" tabindex="1">
                        <span class="down-arrow">â–¼</span>
                        <span class="adult-icon"></span>
                    </button>
                </div>
                <label class="sc-checkbox prefer-directs">
                    <input type="checkbox" id="js-prefer-directs" class="visuallyhidden" tabindex="1"> 직항만
                </label>
                <button class="js-search-button fss-bpk-button fss-bpk-button--large" type="button" tabindex="1">
                    <span class="bpk-text">항공권 검색&nbsp;</span>
                    <span class="bpk-icon-lg bpk-icon-pointer bpk-icon-lg--align-to-button"></span>
                </button>
            </section>
        </form>
</section>

        
      </div>
    </div>
  </div>


</body>
</html>	
