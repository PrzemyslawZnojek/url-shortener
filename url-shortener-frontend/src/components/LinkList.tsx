import Link from "./Link"

export default function LinkList() {
  return (
    <div className="flex flex-col rounded-md h-1/2 w-1/2 p-10 bg-gray-200 font-medium text-xl overflow-auto">
      <div className="flex my-2 text-zinc-500">
        <div className="flex w-1/3"> 
          <h1>Long Url</h1>
        </div>
        <div className="flex w-1/3">
          <h1>Short Url</h1>
        </div>
        <div className="flex w-1/3">
          <h1>Created</h1>
        </div>
      </div>
      <Link />
      <Link />
      <Link />
    </div>
  )
}
