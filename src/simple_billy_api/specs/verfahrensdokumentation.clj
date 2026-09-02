(ns simple-billy-api.specs.verfahrensdokumentation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.compliance-entry :refer :all]
            )
  (:import (java.io File)))


(def verfahrensdokumentation-data
  {
   (ds/req :entries) (s/coll-of compliance-entry-spec)
   (ds/req :generated_at) string?
   (ds/req :title) string?
   (ds/req :version) string?
   })

(def verfahrensdokumentation-spec
  (ds/spec
    {:name ::verfahrensdokumentation
     :spec verfahrensdokumentation-data}))
