(ns simple-billy-api.specs.anlage-g-ergebnis
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.anlage-g-kfz-hinweis :refer :all]
            )
  (:import (java.io File)))


(def anlage-g-ergebnis-data
  {
   (ds/req :gewinn_verlust) string?
   (ds/req :gewst_gezahlt) string?
   (ds/req :gewst_messbetrag_approx) string?
   (ds/req :gewst_pflichtig) boolean?
   (ds/req :jahr) int?
   (ds/req :kfz_hinweise) (s/coll-of anlage-g-kfz-hinweis-spec)
   })

(def anlage-g-ergebnis-spec
  (ds/spec
    {:name ::anlage-g-ergebnis
     :spec anlage-g-ergebnis-data}))
