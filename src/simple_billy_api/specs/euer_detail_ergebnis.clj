(ns simple-billy-api.specs.euer-detail-ergebnis
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.euer-zeile-detail :refer :all]
            )
  (:import (java.io File)))


(def euer-detail-ergebnis-data
  {
   (ds/req :jahr) int?
   (ds/req :zeilen) (s/coll-of euer-zeile-detail-spec)
   })

(def euer-detail-ergebnis-spec
  (ds/spec
    {:name ::euer-detail-ergebnis
     :spec euer-detail-ergebnis-data}))
