import CalculateScore from "./Components/CalculateScore";

function App() {
  return (
    <div>
      <CalculateScore
        Name="Jai Krishna"
        School="ABC High School"
        Total={450}
        goal={5}
      />
    </div>
  );
}

export default App;