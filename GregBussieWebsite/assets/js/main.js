//hide nav bar when scrolling down and show when scrolling up
var prevScrollpos = window.pageYOffset;
window.onscroll = function() {
    var currentScrollPos = window.pageYOffset;
    if (prevScrollpos > currentScrollPos) {
        document.getElementById("navbar").style.top = "0";
    } else {
        document.getElementById("navbar").style.top = "-500px";
    }
    prevScrollpos = currentScrollPos;
}


//show pop up banner after 2 seconds
function showPopUpBanner() {
    $('.popUpBannerBox').fadeIn("2000");
}
setTimeout(showPopUpBanner, 3000);

//close pop up box
$('.popUpBannerBox').click(function(e) {
    if ( !$(e.target).is('.popUpBannerContent, .popUpBannerContent *' ) ) {
        $('.popUpBannerBox').fadeOut("2000");
        return false;
    }
});


$('.closeButton').click(function() {
    $('.popUpBannerBox').fadeOut("2000");
    return false;
});