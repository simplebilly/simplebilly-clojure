(ns simple-billy-api.specs.recurring-template
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def recurring-template-data
  {
   (ds/req :created_at) string?
   (ds/opt :deleted_at) string?
   (ds/opt :end_date) inst?
   (ds/req :execution_interval) string?
   (ds/req :execution_status) string?
   (ds/req :finalize) boolean?
   (ds/opt :last_executed_at) inst?
   (ds/req :name) string?
   (ds/opt :next_execution_at) inst?
   (ds/req :start_date) inst?
   (ds/req :template_id) string?
   (ds/req :template_type) string?
   (ds/opt :updated_at) string?
   (ds/req :voucher_data) any-type-spec
   })

(def recurring-template-spec
  (ds/spec
    {:name ::recurring-template
     :spec recurring-template-data}))
