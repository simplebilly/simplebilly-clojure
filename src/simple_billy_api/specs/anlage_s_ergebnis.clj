(ns simple-billy-api.specs.anlage-s-ergebnis
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.anlage-s-kfz-hinweis :refer :all]
            )
  (:import (java.io File)))


(def anlage-s-ergebnis-data
  {
   (ds/req :gewinn_verlust) string?
   (ds/req :jahr) int?
   (ds/req :kfz_hinweise) (s/coll-of anlage-s-kfz-hinweis-spec)
   })

(def anlage-s-ergebnis-spec
  (ds/spec
    {:name ::anlage-s-ergebnis
     :spec anlage-s-ergebnis-data}))
