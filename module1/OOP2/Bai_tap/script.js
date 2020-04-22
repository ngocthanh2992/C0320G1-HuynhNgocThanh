/**
 * Created by nhatnk on 4/26/17.
 */

function Hero(image, top, left, size, speed) {
    this.image = image;
    this.top = top;
    this.left = left;
    this.size = size;
    this.speed = speed;

    this.getHeroElement = function () {
        return '<img width="' + this.size + '"' +
            ' height="' + this.size + '"' +
            ' src="' + this.image + '"' +
            ' style="top: ' + this.top + 'px; left:' + this.left + 'px;position:absolute;" />';
    }

    this.moveRight = function () {
        this.left += this.speed;
        console.log('ok: ' + this.left);
    }
    this.moveDown = function () {
        this.top += this.speed;
        console.log('ok: ' + this.top);
    }
    this.moveLeft = function () {
        this.left -= this.speed;
        console.log('ok: ' - this.left);
    }
    this.moveUp = function () {
        this.top -= this.speed;
        console.log('ok: ' - this.top)
    }
}

var hero = new Hero('pikachu.png', 10, 10, 100, 50);
let check = true;
let check2 = true;
function start() {
    if (hero.left < window.innerWidth - hero.size && check === true) {
        hero.moveRight();
    } else if (hero.top < window.innerHeight - hero.size && check2 === true) {
        hero.moveDown();
        check = false;
    } else if (hero.left < window.innerWidth && check === false && hero.left > 10) {
        hero.moveLeft();
        check2 = false;
    }else if (hero.top < window.innerHeight && check2 === false && hero.top > 10){
      hero.moveUp();
    }else {
      check = true;
      check2 = true;
    }
    document.getElementById('game').innerHTML = hero.getHeroElement();
    setTimeout(start, 100)
}

start();