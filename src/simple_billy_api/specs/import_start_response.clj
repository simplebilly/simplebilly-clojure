(ns simple-billy-api.specs.import-start-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def import-start-response-data
  {
   (ds/req :job_id) string?
   })

(def import-start-response-spec
  (ds/spec
    {:name ::import-start-response
     :spec import-start-response-data}))
