(ns simple-billy-api.specs.fristen-ergebnis
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.frist-eintrag :refer :all]
            )
  (:import (java.io File)))


(def fristen-ergebnis-data
  {
   (ds/req :anzahl) int?
   (ds/req :fristen) (s/coll-of frist-eintrag-spec)
   })

(def fristen-ergebnis-spec
  (ds/spec
    {:name ::fristen-ergebnis
     :spec fristen-ergebnis-data}))
