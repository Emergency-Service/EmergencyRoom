const express = require('express');
const session = require('express-session');
const bodyParser = require('body-parser');
const path = require('path');

const app = express();

// Body-parser와 세션 설정
app.use(bodyParser.json());
app.use(session({
    secret: 'your_secret_key',
    resave: false,
    saveUninitialized: true
}));

// 정적 파일 경로 설정
app.use(express.static(path.join(__dirname, 'static')));

// Mustache 템플릿 설정
app.set('view engine', 'mustache');
app.set('views', path.join(__dirname, 'templates'));

// 로그인 처리
app.post('/login', (req, res) => {
    const { username, password } = req.body;

    if (username === 'admin' && password === '1234') {
        req.session.user = { username }; // 세션 저장
        res.json({ success: true });
    } else {
        res.json({ success: false });
    }
});

// 세션 상태 확인
app.get('/session-status', (req, res) => {
    const isLoggedIn = !!req.session.user; // 로그인 여부 확인
    res.json({ isLoggedIn });
});

// 로그아웃 처리
app.get('/logout', (req, res) => {
    req.session.destroy(err => {
        if (err) {
            console.error(err);
            res.status(500).send('Logout failed');
        } else {
            res.redirect('/');
        }
    });
});

// 메인 페이지 렌더링
app.get('/', (req, res) => {
    const isLoggedIn = !!req.session.user; // 로그인 여부 확인
    res.render('header', { isLoggedIn });
});

// 서버 실행
const PORT = 3000;
app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});