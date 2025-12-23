function Son(props) {
    return (
        <div style={{background: 'lightgreen'}}>
            <h2>Son</h2>
            <div>{props.children}</div>
        </div>
    );
}

function Daughter(props) {
    return (
        <div style={{background: 'lightblue'}}>
            <h2>Daughter</h2>
            <div>{props.children}</div>
        </div>
    );
}

function Parent()
{
    return (
        <div>
            <h1>My Two Childern</h1>
            <Son>
                <p>
                    Son Component
                </p>
            </Son>
            <Daughter>
                <p>
                    Daughter Component
                </p>
            </Daughter>      
        </div>
    );
}

export default Parent;