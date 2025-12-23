import React, {useState} from "react";
function ToDoList() {
    const [tasks, setTasks] = useState([]);
    const [input, setInput] = useState('');
    const addTask = () => {
        if(input.trim()) {
            setTasks([...tasks, {text:input, completed:false}],setInput(''));
        }
    };
    const toggleTask = (index) => {
        const newTasks = tasks.map((tasks,i) =>
            i === index ? {...tasks,completed:tasks.completed} : tasks);
        setTasks(newTasks);
    };
    const deleteTask = (index) => {
        const newTasks = tasks.filter((_,i) => i !== index);
        setTasks(newTasks);
    };

    return(
        <div className="app">
            <h1>To-Do-List</h1>
            <div className="input-container">
                <input type="text" value={input} onChange={(e) => setInput(e.target.value)}></input>
                <button className="button" onClick={addTask}>➕</button>
            </div>
            <ul className="task-list">
                {tasks.map((task,index) => (
                    <li key={index} className={task.completed ? 'task completed' : 'task'}>
                        <span onClick={() => toggleTask(index)}>{task.text}</span>
                        <button onClick={() => deleteTask(index)}>❌</button>
                    </li>
                ))}
            </ul>
        </div>
    )
}

export default ToDoList;