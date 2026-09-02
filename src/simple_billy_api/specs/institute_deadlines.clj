(ns simple-billy-api.specs.institute-deadlines
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def institute-deadlines-data
  {
   (ds/opt :abschlusspruefungMonths) int?
   (ds/opt :jahresabschlussBafinMonths) int?
   (ds/req :offenlegungMonths) int?
   })

(def institute-deadlines-spec
  (ds/spec
    {:name ::institute-deadlines
     :spec institute-deadlines-data}))
