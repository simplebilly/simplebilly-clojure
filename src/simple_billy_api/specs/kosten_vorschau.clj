(ns simple-billy-api.specs.kosten-vorschau
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.kosten-eintrag :refer :all]
            )
  (:import (java.io File)))


(def kosten-vorschau-data
  {
   (ds/req :eintraege) (s/coll-of kosten-eintrag-spec)
   (ds/req :gesamt) string?
   })

(def kosten-vorschau-spec
  (ds/spec
    {:name ::kosten-vorschau
     :spec kosten-vorschau-data}))
