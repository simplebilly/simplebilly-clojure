(ns simple-billy-api.specs.compliance-entry
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def compliance-entry-data
  {
   (ds/req :description) string?
   (ds/req :module) string?
   (ds/req :regulations) (s/coll-of string?)
   })

(def compliance-entry-spec
  (ds/spec
    {:name ::compliance-entry
     :spec compliance-entry-data}))
