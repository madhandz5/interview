
<h1>Coding Test</h1>

<p><span>1️⃣ Strategy Pattern</span></p>
<p><span>요구사항</span></p>
<ul>
    <li>
        <span>목표 : GameCharacter의 공격기능</span>
    </li>
    <li>
        <span>기본적으로 맨손공격이 가능함. 무기를 장착 할 수 있으며,검, 활, 도끼등의 무기를 장착 할 수 있다.</span>
    </li>
    <li>
        <span>console에 공격상태를 출력</span>
    </li>
</ul>

<p><span>2️⃣ Factory Method Pattern</span></p>
<p><span>요구사항</span></p>
<ul>
<li style="list-style-type: decimal">목표 : 아이템 - 무기를 생성하는 기능이 필요.</li>

<li style="list-style-type: decimal">아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청합니다.</li>
<li style="list-style-type: decimal">아이템을 생성 후 아이템 복제등의 어뷰징을 방지하기 위해 데이터 베이스에 아이템 생성정보를 남깁니다.</li>
<li style="list-style-type: square">아이템을 생성하는 주체를 ItemCreator로 이름 짓습니다.</li>
<li style="list-style-type: square">아이템은 item이라는 interface로 다룰 수 있도록 합니다.</li>
<li style="list-style-type: decimal">item은 use함수를 기본 함수로 갖고 있습니다.</li>
</ul>

<p><span>3️⃣ Singleton Pattern</span></p>
<p><span>요구사항</span></p>
<ul>
<li style="list-style-type: decimal">목표 : 공장내 생산되는 TV스피커에 접근할 수 있는 클래스를 구현</li>
<li style="list-style-type: decimal">하나의 인스턴스만 생성하도록 구현</li>
<li style="list-style-type: decimal">볼륨은 1부터 50까지의 수치를 갖는다.</li>
<li style="list-style-type: decimal">최초 TV가 생산될 때의 볼륨은 25로 설정한다.</li>
<li style="list-style-type: decimal">1번 TV 의 볼륨을 50으로 조정</li>
<li style="list-style-type: decimal">2번 TV 의 볼륨을 1로 조정</li>
</ul>
