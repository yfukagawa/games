let i = 0;
let choice = '';

function select() {
    if(this.choice === '') {
        if(i%2 === 0 ) {
            this.choice === 'X';
        } else {
            this.choice === 'O';
        }
        i ++;
    }
    
    
}