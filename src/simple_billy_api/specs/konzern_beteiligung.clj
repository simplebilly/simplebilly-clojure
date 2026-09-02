(ns simple-billy-api.specs.konzern-beteiligung
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def konzern-beteiligung-data
  {
   (ds/req :company_name) string?
   (ds/req :control_basis) (s/coll-of string?)
   (ds/req :controlled) boolean?
   (ds/req :ownership_pct) string?
   })

(def konzern-beteiligung-spec
  (ds/spec
    {:name ::konzern-beteiligung
     :spec konzern-beteiligung-data}))
