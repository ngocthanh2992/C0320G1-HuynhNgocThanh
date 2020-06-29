$(document).ready(function() {
    $(".menu-icon").on("click", function() {
        $("nav ul").toggleClass("showing");
    });
});
// Scrolling Effect
$(window).on("scroll", function() {
    if($(window).scrollTop()) {
        $('nav').addClass('black');
    }
    else {
        $('nav').removeClass('black');
    }
})
$("li.dropdown").click(function(){
    if($(this).hasClass("open")) {
        $(this).find(".dropdown-menu").slideUp("fast");
        $(this).removeClass("open");
    }
    else {
        $(this).find(".dropdown-menu").slideDown("fast");
        $(this).toggleClass("open");
    }
});
// Close dropdown on mouseleave
$("li.dropdown").mouseleave(function(){
    $(this).find(".dropdown-menu").slideUp("fast");
    $(this).removeClass("open");
});